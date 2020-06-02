# oop

OOP

I.	Định nghĩa: OOP viết tắt của Object Oriented Programming là kỹ năng lập trình mà tất cả các logic, yêu cầu thực tế đều xoay quanh các đối tượng.
Khi sử dụng OOP chúng ta sẽ định nghĩa các class để mô hình hoá các đối tướng thực tế. Trong thế giới thực, đối tượng là những thực thể tồn tại có trạng thái và hành vi.

II.	Tính chất của lập trình hướng đối tượng
1.	Tính đóng gói
Đó là một cơ chế liên kết dự liệu và code chung với nhau thành một đơn vị duy nhất ở đây là (package). 
Chúng ta thực hiện tính đóng gói trong java bằng cách:
-	Định nghĩa các biến của lớp với phạm vi là private.
-	Chỉ cho phép truy cập vào các thuộc tính/biến của đối tượng thông qua hàm getter, setter.
Ví dụ: 
class : Animals
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

Ở trên chúng ta không thể chỉnh sửa trực tiếp name mà muốn thay đổi thì phải thông qua phương thức setName() , và phương thức getName() để lấy dữ liệu.
2.	Tính kế thừa: 
Tính kế thừa cho những thuộc tính của một lớp có thể được kế thừa bởi một lớp khác. Nó giúp chúng ta có thể sử dụng lại code và thiết lập một mối quan hệ giữa các class khác nhau. 
Ví dụ: 
Class Animal.java
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


Class Cat.java kế thừa từ class Animal

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }
    public void meow(){
        System.out.println("meo meo");
    }
}

//Run 
Cat cat= new Cat("Meo1");
cat.eat();
cat.meow();

Ở ví dụ trên class Cat kế thừa các thuộc tính, hàm khởi tạo và phương thức eat() từ class Animal.

3.	Tính trừu tượng:
Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề. Đó là một quá trình che dấu các hoạt động bên trong và chỉ hiển thị những tính năng thiết yếu của đối tượng tới người dùng.
-	Lớp trừu tượng là lớp chứa ít nhất một phương thức trừu tượng
-	Chúng ta không thể dùng trực tiếp nó để tạo ra đối tượng mà phải viết một lớp kế thừa của lớp trừu tượng đó.
-	Những lớp trừu tượng không cần phải có phương thức khởi tạo.
Ví dụ:
Abstract Class Animal.java
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void soud();
    public void eat(){
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Meo meo");
    }

}
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Gau gau");
    }

}


Lớp Animal có phương thức trừu tượng tên là soud() dùng để hiển thị tiếng kêu của từng loài động vật tương ứng. Lớp Dog và Cat là 2 lớp kế thừa của Animal thông qua sự ghi đè phương thức.

ưu điểm khi sử dụng tính trừu tượng:
-	Tính trừu tượng cho phép lập trình viên loại bỏ tính phức tạp của đội tượng bằng cách chỉ ra các thuộc tính và phương thức cần thiết của đối tượng.
-	Giúp chúng ta tập trung vào những cốt lõi cần thiết của đối tuọng thay vì quan tâm đên cachs nó thực hiện

•	Để sử dụng lớp trừu tượng thì class kế thừa lại nó phải override lại tất cả các abstract method (phương thức trừu tượng).
4.	Tính đa hình:
Là khả năng một đối tượng có thể thực hiện một tác vụ theo nhiều cách khác nhau.
Trong java chúng ta sử dụng nạp chồng phương thức( method overloading) và phương thức ghi đè(method overriding) để có tính đa hình.
-	Nạp chồng(Overloading): Đây là khả năng cho phép một lớp có nhiều thuộc tính, phương thức cùng tên nhưng khác tham số khác nhau về loại cũng như về số lượng. Khi được goị, dựa vào tham số truyền vào , phương thức tương ứng sẽ được thức hiện.

Ví dụ: 
public class Student {
    private String name;
    private int age;
    private String phone;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}

Ở ví dụ ta có 3 cách khởi tạo Đối tượng Student.

-	Ghi đè(Overriding): là 2 phương thức có cùng tên, cùng tham số và kiểu trả về nhưng thằng con lại viết lại theo cách dùng cuả nó.

III.	Ưu điểm: Với tính chất OOP đặc thù của mình cho nên ta có thể thấy:
-	Khả năng mở rộng cao.
-	Có khả năng tái sử dụng rất tốt nhờ tình kế thừa.
-	Dễ quản lý code khi cần thêm tính năng.
-	Dễ đọc, đơn giản, dễ bảo trì…



Interface và Abstract

Interface
-Không phải là một class.
-Chỉ chứa nhưng method/properties trống, không có thực thi.
-Nó giống như một khuôn mẫu, một khung để các lớp implement và follow
-Các lớp có thể implements nhiều interface
-Là một contract, các class implemnt phải triển khai các method theo như interface đã đinh nghĩa.
-Mọi method/properties phải là public	

Abstract:
-Có 2 loại method là abstract và method thường: abstract là method trống không có thực thi, method thường là method có thực thi.
-Các lớp chỉ kế thừa một Abstract class.
-Hướng đến tính năng và những tính năng có thực thi được sử dụng làm hàm chung cho các class extend.
-Có thể xác định modifel

Khi nào sử dụng chúng:

Interface: 
-Định nghĩa các chức năng, các giá trị chung cho các lớp không có mỗi liên hệ với nhau
-Tận dụng được đa kế thừa k có ở Class.
-Muốn xác định các hành vi nhưng không quan tâm lớp nào sẽ thực thi chúng

Abstract: 
-Muốn chia sẽ code giữa các lớp trong quan hệ kế thừa
-Muốn lớp này cũng chứa cả các thành phần private, protected
-Muốn lớp này chứa các thành phần khác static, final 

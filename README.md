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
Tính trừu tượng được thể hiện qua class abstract( lớp trừu tượng) và interface(giao diện)
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

-	Ghi đè(Overriding): là 2 phương thức có cùng tên, cùng tham số và kiểu trả về nhưng thằng con lại viết lại theo cách dùng của nó.
Ví dụ:
Animal.java
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

Cat.java
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Meo meo");
    }
}

Dog.java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Gau gau");
    }
}

Cùng là method soud() những ở 2 class Cat và Dog khi override lại ta sẽ viết lại sao cho phù hợp với đối tượng. 
III.	Ưu điểm: Với tính chất OOP đặc thù của mình cho nên ta có thể thấy:
-	Khả năng mở rộng cao.
-	Có khả năng tái sử dụng rất tốt nhờ tình kế thừa.
-	Dễ quản lý code khi cần thêm tính năng.
-	Dễ đọc, đơn giản, dễ bảo trì…

IV.	Nhược điểm: Nhược điểm của phương pháp lập trình đối tượng OOP có thể khiến dữ liệu được xử lý tách rời, khi cấu trúc dữ liệu thay đổi sẽ dẫn đến việc thuật toán bị thay đổi theo. Bên cạnh đó, OOP không tự động khởi tạo và giải phóng dữ liệu động, không mô tả được đầy đủ và trung thực hệ thống trong thực tế.



Interface và Abstract

– Abstract class: là một class cha cho tất cả các class có cùng bản chất. Bản chất ở đây được hiểu là kiểu, loại, nhiệm vụ của class. Hai class cùng hiện thực một interface có thể hoàn toàn khác nhau về bản chất. Hiểu đơn giản như một thằng con (child class) chỉ có thể là con của một thằng cha, có tính cách giống cha (abstract class) nó.
– Interface: là một chức năng mà bạn có thể thêm và bất kì class nào. Từ chức năng ở đây không đồng nghĩa với phương thức (hoặc hàm). Interface có thể bao gồm nhiều hàm/phương thức và tất cả chúng cùng phục vụ cho một chức năng.

Interface	Abstract
-	Không phải là một class.
-	Không thể định nghĩa code xử lý, chỉ có thể khai báo.
-	Các lớp có thể implements nhiều interface
-	Là một contract, các class implemnt phải triển khai các method theo như interface đã đinh nghĩa.
-	Mọi method/properties phải là public	-	Là một class.
-	Có thể định nghĩa thân phương thức, property.
-	Các lớp chỉ kế thừa một Abstract class.
-	Hướng đến tính năng và những tính năng có thực thi được sử dụng làm hàm chung cho các class extend.
-	Có thể xác định modifel


Ví dụ:

Abstract
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void soud();
    public abstract void move();
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

Interface
public interface Action {

    void eat();
    void move();
}

	 Ở ví trụ trên ta có thể thấy ta khai báo private cho biến và ta có thể triển khai lênh thực thi bên trong các các phương thức eat(), getName(), setName() ở abstract Animal. Còn ở Interface Action biến hay phương thức mặc định của chúng là public ta không thể thay đổi được.

Ví dụ 2:
public class Bird implements Action ,a,b{
    //Phai override lại tất cả method có trong Interface
    @Override
    public void eat() {
        System.out.println("......");
    }

    @Override
    public void move() {

    }
}


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void soud();
    public abstract void move();
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

    }

    @Override
    public void move() {

    }


}
	Class Bird có thể implements nhiều Interface ( có thể nói là đa kế thừa) còn class Cat chỉ có thể extends chỉ duy nhất.
	Và ở class Bird thì phải override lại tất cả các phương thức trong Interface Action, a, b. Class Cat có thể tuỳ chọn dùng hay không dùng các method thường cụ thể ở đây các method eat(), getName(), setName().

Khi nào sử dụng chúng:

Nhìn vào hình ảnh dưới đây và ví dụ:
 
Vidu: Interface 
public interface Action {
    void barkable();
    void runable();
    void flyable();
    void swinable();
}


public abstract class Animal2 {
    
    public void eat() {

    }
    abstract void type();
}

public abstract class Machine {
    abstract void fuel();
}
	Theo như hình ảnh và ví dụ trên ở các hành động barkable, runable, flyable, swinable ở Interface Action nhứ là bản thiết kế tổng thể mà nó không quan tâm loại nào sẽ dùng nó, cụ thể là runable() car và dog thuộc 2 loại khác nhau nhưng có thể dùng nó.
	Còn ở Abstrast nó sẽ tập hợp các tính chất chung của các đối tượng. Ví dụ Bird, Cat, Dog, Fish đó là các đối tượng thuộc Animal chắc sẽ có hành động eat(). Vì vâỵ ở class Animal ta sẽ tạo một method eat() còn nó được triển khai ra sao thì phù thuộc vào đối tượng sẽ kế thừa nó sao cho phù hợp với đối tượng.
	Tương tự  Machine là máy móc nên sẽ có dùng nhiên liệu(fuel()), Car, Planes sẽ kế thừa nó


Interface: 
-	Định nghĩa các chức năng, các giá trị chung cho các lớp không có mỗi liên hệ với nhau
-	Tận dụng được đa kế thừa k có ở Class.
-	Muốn xác định các hành vi nhưng không quan tâm lớp nào sẽ thực thi chúng

Abstract: 
-	Muốn chia sẽ code giữa các lớp trong quan hệ kế thừa
-	Muốn lớp này cũng chứa cả các thành phần private, protected
-	Muốn lớp này chứa các thành phần khác static, final 

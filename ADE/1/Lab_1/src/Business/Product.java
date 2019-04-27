package Business;


public class Product {
    
    private String name;
    private String price;
    private String availNum;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

// work flow

// 在 Business 下新建一个class(attributions)： Product(name,price,availNum,description) 
// 在 class Product 下插入set函数和get函数


// 在 Interface 下新建三个classes：MainJFrame, CreatePanel, ViewPanel

// 在 MainJFrame-Design 下插入一个splitPane, 左右分成controlPanel和displayPanel, 在controlPanel下新建两个Buttons(createBtn,viewBtn)
// 在 CreatePanel-Design 下插入Label,TextField以及一个Button(为什么没有重命名？？？)
// 在 ViewPanel-Design 下插入Label,TextField


// 目标1：点击 MainJPanel-Design 中的 create/view-Btn, Create/View-Panel 将会出现。具体操作如下：

// 代码最外围， 【import Business.Product;】
// class MainJFrame中，做private声明 Product类下的object 【private Product product;】
// 在构造方法（public MainJFrame() {}）中，做object初始化【product = new Product(); 】

// 在 createBtn 下，创建一个object 【class objectreference = new class (object);】，这里的object指的就是刚刚声明的"product"
// 在 createBtn 下，将Design和Source连接起来，Design中的splitPanel-rightButton在点击创建按钮后应该在右侧显示createPanel【splitPanel.setRightComponent(createPanel); 】
// 同理，
// 在viewBtn 下，创建一个object 【class objectreference = new class (object);】,这里的object指的依旧是product
// 在viewBtn 下，将 Design和Source连接起来，【splitPanel.setRightComponent(viewPanel); 】


// 目标2：用户的输入内容可以传送到object中。具体操作如下：
// 代码最外围， 【import Business.Product;】
// class CreatePanel中，做private声明 Product类下的object 【private Product product;】
// 在构造方法（public CreatePanel(Product product) {}）中，做object初始化【this.product = product; 】。此步骤和MainJFrame构造方法中的操作不同，这一步涉及参数和this的使用
// 点击创建产品后，object和用户输入的信息绑定在了一起【product.set__(__TextField.getText());】,__指的是四个attribution

// 目标3：object中的信息赋值给ViewPanel。具体操作如下：
// 代码最外围， 【import Business.Product;】
// class ViewPanel中，做private声明 Product类下的object 【private Product product;】
// 在构造方法（public ViewPanel(Product product) {}）中，声明显示函数【displayProduct(product);】，注意函数声明的时候括号里的object不需要把类写上
// 写函数【private void displayProduct(Product product){}】,注意正式写函数的时候括号里的object要把类也写上
// 函数中，首先在product上使用get__函数，并将get到的值赋给一个代号，然后在textfield上使用set函数，将代号set到textfield上【String 代号 = product.get__(); __TextField.setText(代号);】

// 目标3：点击 CreatePanel 中的创建按钮，会出现创建成功的信息提示。
// 在 CreatePanel.java的最外围【import javax.swing.JOptionPane;】
// 在对应的button代码下【JOptionPane.showMessageDialog(null,"Create Product Successfully!");】
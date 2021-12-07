package top.fengyulou;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author guochao
 * @Date 2021/12/2 22:46
 * @Version 1.0
 */
public class PropertiesDemo {
    /**
     * Properties集合的方法load
     * 读取 properties 文件
     */
    @Test
    public void t1() throws IOException {
        Properties pro = new Properties();
        FileReader fr = new FileReader("E:\\github\\java-basics\\src\\test\\java\\pro.properties");
        //调用集合的方法load，传递字符输入流
        pro.load(fr);
        fr.close();
        System.out.println(pro);
    }

    /**
     *  Properties集合的特有方法store
     *  将集合中的键值对,写回文件中保存
     */
    @Test
    public void t2() throws IOException {
        Properties pro = new Properties();
        pro.setProperty("name","guobiting");
        pro.setProperty("age","31");
        pro.setProperty("email","guobiting@163.com");
        FileWriter fw=new FileWriter("E:\\github\\java-basics\\src\\test\\java\\pro.properties");
        //键值对，存回文件，使用集合的方法store传递字符输出流
        pro.store(fw,"");
    }
}

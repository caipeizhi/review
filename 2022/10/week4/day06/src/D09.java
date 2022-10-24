import lombok.SneakyThrows;
import org.junit.Test;

import java.io.File;

/**
 * @ClassName D09
 * @Description TODO
 * @Author cc
 * @Date 2022/10/22 20:50
 * @Version 1.0
 */
public class D09 {
    @SneakyThrows
    @Test
    public void test() {
        /**
         *         我们可以使用File类的方法
         *         创建一个文件/文件夹
         *         删除文件/文件夹
         *         获取文件/文件夹
         *         判断文件/文件夹是否存在
         *         对文件夹进行遍历
         *         获取文件的大小
         */
        File file = new File("1.txt");
        file.createNewFile();
    }
}

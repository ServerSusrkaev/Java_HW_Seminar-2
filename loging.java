import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.*;
public class loging {
    public static void main(String[] args) throws IOException{
        Logger logger = Logger.getLogger(loging.class.getName());
        FileHandler fh = new FileHandler("log.xml");

        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);

        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");



        Scanner input = new Scanner(System.in);
        System.out.print("Укжите диапазон сортровки: ");
        int size = (int) input.nextInt();

        int[] array = new int[size];
        
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * size + 1);
            System.out.print(array[i] + ", ");
        }

        Arrays.sort(array);

        System.out.println("");

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }

    }
}

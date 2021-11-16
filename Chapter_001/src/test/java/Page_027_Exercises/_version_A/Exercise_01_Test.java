package Page_027_Exercises._version_A;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 16.11.2021 13:43.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class Exercise_01_Test {

    @Test
    public void whenTestHelloAlec() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Exercise_01.helloAlec();

        assertThat(
                out.toString(),
                is(String.format("Hello! Alec.%s",System.getProperty("line.separator")))
        );
    }

    @Test
    public void whenAddOneToOneThenTwo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter name: ");
        String name = sc.nextLine();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Exercise_01.main(null);

        assertThat(
                out.toString(),
                is(String.format("Hello! %s.", name))
        );
    }
}

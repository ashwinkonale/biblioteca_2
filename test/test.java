import com.twu28.biblioteca.libraryBangalore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class test {
    @Test
    public void welcome(){
        //new libraryBangalore();
        libraryBangalore library =   new libraryBangalore();
        String welcome = library.welcomemsg();
        //System.out.println(welcome);
        assertSame(welcome, "welcome to library");


    }

}

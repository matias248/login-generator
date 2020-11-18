package geco;

import junit.framework.TestCase;
import org.junit.*;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

public class testUnitaire extends TestCase {

    LoginService ls;
    @Before
    public  void initLoginService(){
        List<String> array=new ArrayList<String>();
        array.add("b");array.add("a");
        String[] arrayB={"b","a"};
        //System.out.println(array.get(0)+ "lala "+ (ls=new LoginService(arrayB)).findAllLogins().get(0));
        assertTrue(2!=2);
        assertEquals("Init correct",array.get(0),(ls=new LoginService(arrayB)).findAllLogins().get(0));
    }

    @Test
    public void testExist(){
        assertTrue(ls.loginExists("pato")==false);
    }
    @Test
    public void testAdd(){
        String [] s={"a", "b", "c"};
        ls.addLogin("c");
        assertEquals("il rajoute bien?",s,ls);
    }
    @Test
    public void testfindAllLoginsStartingWith(){
        assertEquals("find all ok?",true,ls.findAllLoginsStartingWith("a"));
    }
    @After
    public void testfindAllLogins(){
        String [] s={"a", "b", "c"};
        assertEquals("find all ok?",s,ls.findAllLogins());
    }

}

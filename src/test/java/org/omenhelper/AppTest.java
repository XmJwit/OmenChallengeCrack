package org.omenhelper;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.omenhelper.Omen.VsJSONProgressEvent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // @Test
    // public void testA(){
    //     // 2021-05-26T11:11:06.115767Z
    //     SimpleDateFormat endTime = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'");
    //
    //     endTime.setTimeZone(TimeZone.getTimeZone("+0"));
    //
    //     String start = endTime.format(new Date(System.currentTimeMillis() - 1000 * 60 * 4));
    //     String end = endTime.format(new Date());
    //
    //     System.out.println(start);
    //     System.out.println(end);
    //
    // }
    //
    // @Test
    // public void signature() throws Exception {
    //     System.out.println(new VsJSONProgressEvent(
    //             "PLAY:LEAGUE_OF_LEGENDS",
    //             "2021-05-27T04:10:07.769485Z",
    //             "2021-05-27T04:10:10.430310Z",
    //             1
    //     ).GetSignature("6589915c-6aa7-4f1b-9ef5-32fa2220c844",""));
    // }
}
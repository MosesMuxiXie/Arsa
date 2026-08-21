/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.ibm.icu.lang.UCharacter
 *  com.ibm.icu.text.ArabicShaping
 *  com.ibm.icu.text.Bidi
 *  com.ibm.icu.text.BidiRun
 */
import com.google.common.collect.Lists;
import com.ibm.icu.lang.UCharacter;
import com.ibm.icu.text.ArabicShaping;
import com.ibm.icu.text.Bidi;
import com.ibm.icu.text.BidiRun;
import java.util.ArrayList;

public class imt {
    public static bfr a(yn $$0, boolean $$1) {
        zg $$2 = zg.a($$0, UCharacter::getMirror, imt::a);
        Bidi $$3 = new Bidi($$2.a(), $$1 ? 127 : 126);
        $$3.setReorderingMode(0);
        ArrayList $$4 = Lists.newArrayList();
        int $$5 = $$3.countRuns();
        for (int $$6 = 0; $$6 < $$5; ++$$6) {
            BidiRun $$7 = $$3.getVisualRun($$6);
            $$4.addAll($$2.a($$7.getStart(), $$7.getLength(), $$7.isOddRun()));
        }
        return bfr.composite($$4);
    }

    private static String a(String $$0) {
        try {
            return new ArabicShaping(8).shape($$0);
        }
        catch (Exception $$1) {
            return $$0;
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.slf4j.Logger;

public class atw {
    private static final Logger a = LogUtils.getLogger();
    private static final String b = "RPC Connection #{}: ";

    public void a(avh $$0, String $$1, Object ... $$2) {
        if ($$2.length == 0) {
            a.info(b + $$1, (Object)$$0.a());
        } else {
            ArrayList<Object> $$3 = new ArrayList<Object>(Arrays.asList($$2));
            $$3.addFirst($$0.a());
            a.info(b + $$1, $$3.toArray());
        }
    }
}


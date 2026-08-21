/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 */
import com.mojang.brigadier.StringReader;

public class eh {
    public static String a(StringReader $$0, k $$1) {
        int $$2 = $$0.getCursor();
        while ($$0.canRead() && $$1.test($$0.peek())) {
            $$0.skip();
        }
        return $$0.getString().substring($$2, $$0.getCursor());
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 */
import com.mojang.datafixers.schemas.Schema;
import java.util.List;

public class bip
extends bir {
    private static final List<String> a = List.of("generic.", "horse.", "player.", "zombie.");

    public bip(Schema $$0) {
        super($$0, "AttributeIdPrefixFix", bip::a);
    }

    private static String a(String $$0) {
        String $$1 = bsh.a($$0);
        for (String $$2 : a) {
            String $$3 = bsh.a($$2);
            if (!$$1.startsWith($$3)) continue;
            return "minecraft:" + $$1.substring($$3.length());
        }
        return $$0;
    }
}


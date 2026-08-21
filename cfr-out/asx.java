/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;

public class asx {
    public static final Codec<asx> a = Codec.STRING.comapFlatMap(asx::a, $$0 -> $$0.c);
    public static final Codec<String> b = Codec.STRING.validate($$0 -> hy.b($$0) ? DataResult.success((Object)$$0) : DataResult.error(() -> $$0 + " is not a valid input name"));
    private final String c;
    private final hy d;

    private asx(String $$0, hy $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    /*
     * WARNING - void declaration
     */
    private static DataResult<asx> a(String $$0) {
        void $$3;
        try {
            hy $$1 = hy.a($$0);
        }
        catch (Exception $$2) {
            return DataResult.error(() -> "Failed to parse template " + $$0 + ": " + $$2.getMessage());
        }
        return DataResult.success((Object)new asx($$0, (hy)$$3));
    }

    public String a(Map<String, String> $$0) {
        List<String> $$12 = this.d.b().stream().map($$1 -> $$0.getOrDefault($$1, "")).toList();
        return this.d.a($$12);
    }
}


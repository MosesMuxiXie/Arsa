/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class hiz {
    private final hjb[] a;
    private int b;

    public static Codec<hiz> a(int $$0) {
        return Codec.list(hjb.a).comapFlatMap($$1 -> {
            int $$2 = $$1.size();
            if ($$2 > $$0) {
                return DataResult.error(() -> "Expected: a buffer of size less than or equal to " + $$0 + " but: " + $$2 + " is greater than " + $$0);
            }
            return DataResult.success((Object)new hiz($$0, (List<hjb>)$$1));
        }, hiz::c);
    }

    public hiz(int $$0) {
        this.a = new hjb[$$0];
    }

    private hiz(int $$0, List<hjb> $$12) {
        this.a = (hjb[])$$12.toArray($$1 -> new hjb[$$0]);
        this.b = $$12.size();
    }

    private List<hjb> c() {
        ArrayList<hjb> $$0 = new ArrayList<hjb>(this.d());
        for (int $$1 = this.a(); $$1 <= this.b(); ++$$1) {
            $$0.add(this.b($$1));
        }
        return $$0;
    }

    public void a(hjb $$0) {
        this.a[this.c((int)this.b++)] = $$0;
    }

    public @Nullable hjb b(int $$0) {
        return $$0 >= this.a() && $$0 <= this.b() ? this.a[this.c($$0)] : null;
    }

    private int c(int $$0) {
        return $$0 % this.a.length;
    }

    public int a() {
        return Math.max(this.b - this.a.length, 0);
    }

    public int b() {
        return this.b - 1;
    }

    private int d() {
        return this.b() - this.a() + 1;
    }
}


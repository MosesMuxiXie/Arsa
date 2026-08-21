/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import org.jspecify.annotations.Nullable;

public class bza<T>
implements byl<StringReader, Dynamic<?>> {
    private final wa<T> a;

    public bza(DynamicOps<T> $$0) {
        this.a = wa.a($$0);
    }

    public @Nullable Dynamic<T> b(byk<StringReader> $$0) {
        $$0.f().skipWhitespace();
        int $$1 = $$0.g();
        try {
            return new Dynamic(this.a.a(), this.a.b($$0.f()));
        }
        catch (Exception $$2) {
            $$0.b().a($$1, $$2);
            return null;
        }
    }

    @Override
    public /* synthetic */ @Nullable Object a(byk byk2) {
        return this.b(byk2);
    }
}


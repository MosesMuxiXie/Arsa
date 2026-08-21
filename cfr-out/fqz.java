/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fqz
extends frc {
    public static final MapCodec<fqz> a = fqz.a(fqz::new);
    public static final Codec<fqz> b = fqz.b(fqz::new);

    fqz(List<frm> $$0) {
        super($$0, bhs.a($$0));
    }

    public static fqz a(List<frm> $$0) {
        return new fqz(List.copyOf($$0));
    }

    @Override
    public frn a() {
        return fro.c;
    }

    public static a a(frm.a ... $$0) {
        return new a($$0);
    }

    public static class a
    extends frc.a {
        public a(frm.a ... $$0) {
            super($$0);
        }

        @Override
        public a and(frm.a $$0) {
            this.a($$0);
            return this;
        }

        @Override
        protected frm a(List<frm> $$0) {
            return new fqz($$0);
        }
    }
}


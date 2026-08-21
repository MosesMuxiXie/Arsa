/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.Predicate;

public class fra
extends frc {
    public static final MapCodec<fra> a = fra.a(fra::new);

    fra(List<frm> $$0) {
        super($$0, (Predicate<fnz>)((Object)bhs.b($$0)));
    }

    @Override
    public frn a() {
        return fro.b;
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
        public a or(frm.a $$0) {
            this.a($$0);
            return this;
        }

        @Override
        protected frm a(List<frm> $$0) {
            return new fra($$0);
        }
    }
}


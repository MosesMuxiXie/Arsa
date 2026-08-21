/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 */
import com.mojang.serialization.MapCodec;

public class aae
implements aag {
    public static final aae a = new aae();
    public static final aah<aae> b = new aah<aae>(){
        private static final MapCodec<aae> a = MapCodec.unit((Object)a);
        private static final aao<xq, aae> b = aao.a(a);

        @Override
        public MapCodec<aae> a() {
            return a;
        }

        @Override
        public aao<xq, aae> b() {
            return b;
        }
    };

    private aae() {
    }

    @Override
    public yw a(int $$0) {
        return yh.i();
    }

    public aah<aae> a() {
        return b;
    }
}


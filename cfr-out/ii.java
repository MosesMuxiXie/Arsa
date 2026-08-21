/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class ii
implements ib<FloatArgumentType, a> {
    @Override
    public void a(a $$0, wx $$1) {
        boolean $$2 = $$0.b != -3.4028235E38f;
        boolean $$3 = $$0.c != Float.MAX_VALUE;
        $$1.l(id.a($$2, $$3));
        if ($$2) {
            $$1.a($$0.b);
        }
        if ($$3) {
            $$1.a($$0.c);
        }
    }

    @Override
    public a a(wx $$0) {
        byte $$1 = $$0.readByte();
        float $$2 = id.a($$1) ? $$0.readFloat() : -3.4028235E38f;
        float $$3 = id.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != -3.4028235E38f) {
            $$1.addProperty("min", (Number)Float.valueOf($$0.b));
        }
        if ($$0.c != Float.MAX_VALUE) {
            $$1.addProperty("max", (Number)Float.valueOf($$0.c));
        }
    }

    @Override
    public a a(FloatArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ ib.a b(wx wx2) {
        return this.a(wx2);
    }

    public final class a
    implements ib.a<FloatArgumentType> {
        final float b;
        final float c;

        a(float $$1, float $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public FloatArgumentType a(dz $$0) {
            return FloatArgumentType.floatArg((float)this.b, (float)this.c);
        }

        @Override
        public ib<FloatArgumentType, ?> a() {
            return ii.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dz dz2) {
            return this.a(dz2);
        }
    }
}


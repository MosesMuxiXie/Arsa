/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ih
implements ib<DoubleArgumentType, a> {
    @Override
    public void a(a $$0, wx $$1) {
        boolean $$2 = $$0.b != -1.7976931348623157E308;
        boolean $$3 = $$0.c != Double.MAX_VALUE;
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
        double $$2 = id.a($$1) ? $$0.readDouble() : -1.7976931348623157E308;
        double $$3 = id.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != -1.7976931348623157E308) {
            $$1.addProperty("min", (Number)$$0.b);
        }
        if ($$0.c != Double.MAX_VALUE) {
            $$1.addProperty("max", (Number)$$0.c);
        }
    }

    @Override
    public a a(DoubleArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ ib.a b(wx wx2) {
        return this.a(wx2);
    }

    public final class a
    implements ib.a<DoubleArgumentType> {
        final double b;
        final double c;

        a(double $$1, double $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public DoubleArgumentType a(dz $$0) {
            return DoubleArgumentType.doubleArg((double)this.b, (double)this.c);
        }

        @Override
        public ib<DoubleArgumentType, ?> a() {
            return ih.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dz dz2) {
            return this.a(dz2);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 */
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ij
implements ib<IntegerArgumentType, a> {
    @Override
    public void a(a $$0, wx $$1) {
        boolean $$2 = $$0.b != Integer.MIN_VALUE;
        boolean $$3 = $$0.c != Integer.MAX_VALUE;
        $$1.l(id.a($$2, $$3));
        if ($$2) {
            $$1.q($$0.b);
        }
        if ($$3) {
            $$1.q($$0.c);
        }
    }

    @Override
    public a a(wx $$0) {
        byte $$1 = $$0.readByte();
        int $$2 = id.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
        int $$3 = id.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
        return new a($$2, $$3);
    }

    @Override
    public void a(a $$0, JsonObject $$1) {
        if ($$0.b != Integer.MIN_VALUE) {
            $$1.addProperty("min", (Number)$$0.b);
        }
        if ($$0.c != Integer.MAX_VALUE) {
            $$1.addProperty("max", (Number)$$0.c);
        }
    }

    @Override
    public a a(IntegerArgumentType $$0) {
        return new a($$0.getMinimum(), $$0.getMaximum());
    }

    @Override
    public /* synthetic */ ib.a b(wx wx2) {
        return this.a(wx2);
    }

    public final class a
    implements ib.a<IntegerArgumentType> {
        final int b;
        final int c;

        a(int $$1, int $$2) {
            this.b = $$1;
            this.c = $$2;
        }

        public IntegerArgumentType a(dz $$0) {
            return IntegerArgumentType.integer((int)this.b, (int)this.c);
        }

        @Override
        public ib<IntegerArgumentType, ?> a() {
            return ij.this;
        }

        @Override
        public /* synthetic */ ArgumentType b(dz dz2) {
            return this.a(dz2);
        }
    }
}


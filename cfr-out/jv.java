/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class jv
extends Record {
    final float c;
    final float d;
    final float e;
    public static final Codec<jv> a = Codec.FLOAT.listOf().comapFlatMap($$02 -> bhs.a($$02, 3).map($$0 -> new jv(((Float)$$0.get(0)).floatValue(), ((Float)$$0.get(1)).floatValue(), ((Float)$$0.get(2)).floatValue())), $$0 -> List.of(Float.valueOf($$0.a()), Float.valueOf($$0.b()), Float.valueOf($$0.c())));
    public static final aao<ByteBuf, jv> b = new aao<ByteBuf, jv>(){

        public jv a(ByteBuf $$0) {
            return new jv($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
        }

        public void a(ByteBuf $$0, jv $$1) {
            $$0.writeFloat($$1.c);
            $$0.writeFloat($$1.d);
            $$0.writeFloat($$1.e);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (jv)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };

    public jv(float $$0, float $$1, float $$2) {
        $$0 = Float.isInfinite($$0) || Float.isNaN($$0) ? 0.0f : $$0 % 360.0f;
        $$1 = Float.isInfinite($$1) || Float.isNaN($$1) ? 0.0f : $$1 % 360.0f;
        $$2 = Float.isInfinite($$2) || Float.isNaN($$2) ? 0.0f : $$2 % 360.0f;
        this.c = $$0;
        this.d = $$1;
        this.e = $$2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{jv.class, "x;y;z", "c", "d", "e"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{jv.class, "x;y;z", "c", "d", "e"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{jv.class, "x;y;z", "c", "d", "e"}, this, $$0);
    }

    public float a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.e;
    }
}


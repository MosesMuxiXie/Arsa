/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 */
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

public class eti
implements eto {
    public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)jx.a.fieldOf("source_entity").forGetter(eti::b), (App)Codec.FLOAT.fieldOf("y_offset").orElse((Object)Float.valueOf(0.0f)).forGetter($$0 -> Float.valueOf($$0.f))).apply((Applicative)$$02, ($$0, $$1) -> new eti((Either<cgk, Either<UUID, Integer>>)Either.right((Object)Either.left((Object)$$0)), $$1.floatValue())));
    public static final aao<ByteBuf, eti> b = aao.a(aam.h, eti::c, aam.l, $$0 -> Float.valueOf($$0.f), ($$0, $$1) -> new eti((Either<cgk, Either<UUID, Integer>>)Either.right((Object)Either.right((Object)$$0)), $$1.floatValue()));
    private Either<cgk, Either<UUID, Integer>> e;
    private final float f;

    public eti(cgk $$0, float $$1) {
        this((Either<cgk, Either<UUID, Integer>>)Either.left((Object)$$0), $$1);
    }

    private eti(Either<cgk, Either<UUID, Integer>> $$0, float $$1) {
        this.e = $$0;
        this.f = $$1;
    }

    @Override
    public Optional<ftm> a(dwo $$02) {
        if (this.e.left().isEmpty()) {
            this.b($$02);
        }
        return this.e.left().map($$0 -> $$0.dI().b(0.0, this.f, 0.0));
    }

    private void b(dwo $$02) {
        ((Optional)this.e.map(Optional::of, $$12 -> Optional.ofNullable((cgk)$$12.map($$1 -> {
            cgk cgk2;
            if ($$02 instanceof axf) {
                axf $$2 = (axf)$$02;
                cgk2 = $$2.d((UUID)$$1);
            } else {
                cgk2 = null;
            }
            return cgk2;
        }, $$02::a)))).ifPresent($$0 -> {
            this.e = Either.left((Object)$$0);
        });
    }

    public UUID b() {
        return (UUID)this.e.map(cgk::cY, $$02 -> (UUID)$$02.map(Function.identity(), $$0 -> {
            throw new RuntimeException("Unable to get entityId from uuid");
        }));
    }

    private int c() {
        return (Integer)this.e.map(cgk::aA, $$02 -> (Integer)$$02.map($$0 -> {
            throw new IllegalStateException("Unable to get entityId from uuid");
        }, Function.identity()));
    }

    public etp<eti> a() {
        return etp.b;
    }

    public static class a
    implements etp<eti> {
        @Override
        public MapCodec<eti> a() {
            return a;
        }

        @Override
        public aao<ByteBuf, eti> b() {
            return b;
        }
    }
}


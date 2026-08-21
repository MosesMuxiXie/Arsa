/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  org.jspecify.annotations.Nullable
 */
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public final class cgr<StoredEntityType extends etd> {
    private static final Codec<? extends cgr<?>> a = jx.a.xmap(cgr::new, cgr::c);
    private static final aao<ByteBuf, ? extends cgr<?>> b = jx.g.a(cgr::new, cgr::c);
    private Either<UUID, StoredEntityType> c;

    public static <Type extends etd> Codec<cgr<Type>> a() {
        return a;
    }

    public static <Type extends etd> aao<ByteBuf, cgr<Type>> b() {
        return b;
    }

    private cgr(StoredEntityType $$0) {
        this.c = Either.right($$0);
    }

    private cgr(UUID $$0) {
        this.c = Either.left((Object)$$0);
    }

    public static <T extends etd> @Nullable cgr<T> a(@Nullable T $$0) {
        return $$0 != null ? new cgr<T>($$0) : null;
    }

    public static <T extends etd> cgr<T> a(UUID $$0) {
        return new cgr($$0);
    }

    public UUID c() {
        return (UUID)this.c.map($$0 -> $$0, etd::cY);
    }

    public @Nullable StoredEntityType a(etc<? extends etd> $$0, Class<StoredEntityType> $$1) {
        StoredEntityType $$5;
        Optional $$4;
        Optional $$2 = this.c.right();
        if ($$2.isPresent()) {
            etd $$3 = (etd)$$2.get();
            if ($$3.eh()) {
                this.c = Either.left((Object)$$3.cY());
            } else {
                return (StoredEntityType)$$3;
            }
        }
        if (($$4 = this.c.left()).isPresent() && ($$5 = this.a($$0.lookup((UUID)$$4.get()), $$1)) != null && !$$5.eh()) {
            this.c = Either.right($$5);
            return $$5;
        }
        return null;
    }

    public @Nullable StoredEntityType a(dwo $$0, Class<StoredEntityType> $$1) {
        if (ddm.class.isAssignableFrom($$1)) {
            return this.a($$0::b, $$1);
        }
        return this.a($$0::a, $$1);
    }

    private @Nullable StoredEntityType a(@Nullable etd $$0, Class<StoredEntityType> $$1) {
        if ($$0 != null && $$1.isAssignableFrom($$0.getClass())) {
            return (StoredEntityType)((etd)$$1.cast($$0));
        }
        return null;
    }

    public boolean b(StoredEntityType $$0) {
        return this.c().equals($$0.cY());
    }

    public void a(fns $$0, String $$1) {
        $$0.a($$1, jx.a, this.c());
    }

    public static void a(@Nullable cgr<?> $$0, fns $$1, String $$2) {
        if ($$0 != null) {
            $$0.a($$1, $$2);
        }
    }

    public static <StoredEntityType extends etd> @Nullable StoredEntityType a(@Nullable cgr<StoredEntityType> $$0, dwo $$1, Class<StoredEntityType> $$2) {
        return $$0 != null ? (StoredEntityType)$$0.a($$1, $$2) : null;
    }

    public static @Nullable cgk a(@Nullable cgr<cgk> $$0, dwo $$1) {
        return cgr.a($$0, $$1, cgk.class);
    }

    public static @Nullable chl b(@Nullable cgr<chl> $$0, dwo $$1) {
        return cgr.a($$0, $$1, chl.class);
    }

    public static @Nullable ddm c(@Nullable cgr<ddm> $$0, dwo $$1) {
        return cgr.a($$0, $$1, ddm.class);
    }

    public static <StoredEntityType extends etd> @Nullable cgr<StoredEntityType> a(fnq $$0, String $$1) {
        return $$0.a($$1, cgr.a()).orElse(null);
    }

    public static <StoredEntityType extends etd> @Nullable cgr<StoredEntityType> a(fnq $$0, String $$12, dwo $$2) {
        Optional<UUID> $$3 = $$0.a($$12, jx.a);
        if ($$3.isPresent()) {
            return cgr.a($$3.get());
        }
        return $$0.g($$12).map($$1 -> bby.a($$2.s(), $$1)).map(cgr::new).orElse(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object $$0) {
        if ($$0 == this) {
            return true;
        }
        if (!($$0 instanceof cgr)) return false;
        cgr $$1 = (cgr)$$0;
        if (!this.c().equals($$1.c())) return false;
        return true;
    }

    public int hashCode() {
        return this.c().hashCode();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.google.common.annotations.VisibleForTesting;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiFunction;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public final class azz
extends Record
implements Comparable<azz> {
    private final int c;
    private final int d;
    private static final Logger e = LogUtils.getLogger();
    public static final Codec<azz> a = azz.b(0);
    public static final Codec<azz> b = azz.b(Integer.MAX_VALUE);

    public azz(int $$0, int $$1) {
        this.c = $$0;
        this.d = $$1;
    }

    private static Codec<azz> b(int $$0) {
        return bfm.c(bfm.q, bfm.q.listOf(1, 256)).xmap($$1 -> $$1.size() > 1 ? azz.a((int)((Integer)$$1.getFirst()), (Integer)$$1.get(1)) : azz.a((int)((Integer)$$1.getFirst()), $$0), $$1 -> $$1.d != $$0 ? List.of(Integer.valueOf($$1.b()), Integer.valueOf($$1.c())) : List.of(Integer.valueOf($$1.b())));
    }

    public static <ResultType, HolderType extends b> DataResult<List<ResultType>> a(List<HolderType> $$0, int $$1, BiFunction<HolderType, bfz<azz>, ResultType> $$2) {
        int $$3 = $$0.stream().map(b::a).mapToInt(a::a).min().orElse(Integer.MAX_VALUE);
        ArrayList<ResultType> $$4 = new ArrayList<ResultType>($$0.size());
        for (b $$5 : $$0) {
            a $$6 = $$5.a();
            if ($$6.b().isEmpty() && $$6.c().isEmpty() && $$6.e().isEmpty()) {
                e.warn("Unknown or broken overlay entry {}", (Object)$$5);
                continue;
            }
            DataResult<bfz<azz>> $$7 = $$6.a($$1, false, $$3 <= $$1, "Overlay \"" + String.valueOf($$5) + "\"", "formats");
            if ($$7.isSuccess()) {
                $$4.add($$2.apply($$5, (bfz)$$7.getOrThrow()));
                continue;
            }
            return DataResult.error(() -> ((DataResult.Error)((DataResult.Error)$$7.error().get())).message());
        }
        return DataResult.success(List.copyOf($$4));
    }

    @VisibleForTesting
    public static int a(azn $$0) {
        return switch ($$0) {
            default -> throw new MatchException(null, null);
            case azn.a -> 64;
            case azn.b -> 81;
        };
    }

    public static MapCodec<bfz<azz>> b(azn $$0) {
        int $$12 = azz.a($$0);
        return azz$a.f.flatXmap($$1 -> $$1.a($$12, true, false, "Pack", "supported_formats"), $$1 -> DataResult.success((Object)azz$a.a($$1, $$12)));
    }

    public static azz a(int $$0, int $$1) {
        return new azz($$0, $$1);
    }

    public static azz a(int $$0) {
        return new azz($$0, 0);
    }

    public bfz<azz> a() {
        return new bfz<azz>(this, azz.a(this.c, Integer.MAX_VALUE));
    }

    public int a(azz $$0) {
        int $$1 = Integer.compare(this.b(), $$0.b());
        if ($$1 != 0) {
            return $$1;
        }
        return Integer.compare(this.c(), $$0.c());
    }

    @Override
    public String toString() {
        if (this.d == Integer.MAX_VALUE) {
            return String.format(Locale.ROOT, "%d.*", this.b());
        }
        return String.format(Locale.ROOT, "%d.%d", this.b(), this.c());
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{azz.class, "major;minor", "c", "d"}, this);
    }

    @Override
    public final boolean equals(Object $$0) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{azz.class, "major;minor", "c", "d"}, this, $$0);
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((azz)object);
    }

    public static interface b {
        public a a();
    }

    public record a(Optional<azz> b, Optional<azz> c, Optional<Integer> d, Optional<bfz<Integer>> e) {
        static final MapCodec<a> f = RecordCodecBuilder.mapCodec($$0 -> $$0.group((App)a.optionalFieldOf("min_format").forGetter(a::b), (App)b.optionalFieldOf("max_format").forGetter(a::c), (App)Codec.INT.optionalFieldOf("pack_format").forGetter(a::d), (App)bfz.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(a::e)).apply((Applicative)$$0, a::new));
        public static final MapCodec<a> a = RecordCodecBuilder.mapCodec($$02 -> $$02.group((App)a.optionalFieldOf("min_format").forGetter(a::b), (App)b.optionalFieldOf("max_format").forGetter(a::c), (App)bfz.a(Codec.INT).optionalFieldOf("formats").forGetter(a::e)).apply((Applicative)$$02, ($$0, $$1, $$2) -> new a((Optional<azz>)$$0, (Optional<azz>)$$1, $$0.map(azz::b), (Optional<bfz<Integer>>)$$2)));

        public static a a(bfz<azz> $$0, int $$1) {
            bfz<Integer> $$2 = $$0.a(azz::b);
            return new a(Optional.of($$0.a()), Optional.of($$0.b()), $$2.a($$1) ? Optional.of($$2.a()) : Optional.empty(), $$2.a($$1) ? Optional.of(new bfz<Integer>($$2.a(), $$2.b())) : Optional.empty());
        }

        public int a() {
            if (this.b.isPresent()) {
                if (this.e.isPresent()) {
                    return Math.min(this.b.get().b(), this.e.get().a());
                }
                return this.b.get().b();
            }
            if (this.e.isPresent()) {
                return this.e.get().a();
            }
            return Integer.MAX_VALUE;
        }

        public DataResult<bfz<azz>> a(int $$0, boolean $$1, boolean $$2, String $$3, String $$4) {
            if (this.b.isPresent() != this.c.isPresent()) {
                return DataResult.error(() -> $$3 + " missing field, must declare both min_format and max_format");
            }
            if ($$2 && this.e.isEmpty()) {
                return DataResult.error(() -> $$3 + " missing required field " + $$4 + ", must be present in all overlays for any overlays to work across game versions");
            }
            if (this.b.isPresent()) {
                return this.b($$0, $$1, $$2, $$3, $$4);
            }
            if (this.e.isPresent()) {
                return this.a($$0, $$1, $$3, $$4);
            }
            if ($$1 && this.d.isPresent()) {
                int $$5 = this.d.get();
                if ($$5 > $$0) {
                    return DataResult.error(() -> $$3 + " declares support for version newer than " + $$0 + ", but is missing mandatory fields min_format and max_format");
                }
                return DataResult.success(new bfz<azz>(azz.a($$5)));
            }
            return DataResult.error(() -> $$3 + " could not be parsed, missing format version information");
        }

        private DataResult<bfz<azz>> b(int $$0, boolean $$1, boolean $$2, String $$3, String $$4) {
            int $$5 = this.b.get().b();
            int $$6 = this.c.get().b();
            if (this.b.get().a(this.c.get()) > 0) {
                return DataResult.error(() -> $$3 + " min_format (" + String.valueOf(this.b.get()) + ") is greater than max_format (" + String.valueOf(this.c.get()) + ")");
            }
            if ($$5 > $$0 && !$$2) {
                String $$7;
                if (this.e.isPresent()) {
                    return DataResult.error(() -> $$3 + " key " + $$4 + " is deprecated starting from pack format " + ($$0 + 1) + ". Remove " + $$4 + " from your pack.mcmeta.");
                }
                if ($$1 && this.d.isPresent() && ($$7 = this.a($$5, $$6)) != null) {
                    return DataResult.error(() -> $$7);
                }
            } else {
                if (this.e.isPresent()) {
                    bfz<Integer> $$8 = this.e.get();
                    if ($$8.a() != $$5) {
                        return DataResult.error(() -> $$3 + " version declaration mismatch between " + $$4 + " (from " + String.valueOf($$8.a()) + ") and min_format (" + String.valueOf(this.b.get()) + ")");
                    }
                    if ($$8.b() != $$6 && $$8.b() != $$0) {
                        return DataResult.error(() -> $$3 + " version declaration mismatch between " + $$4 + " (up to " + String.valueOf($$8.b()) + ") and max_format (" + String.valueOf(this.c.get()) + ")");
                    }
                } else {
                    return DataResult.error(() -> $$3 + " declares support for format " + $$5 + ", but game versions supporting formats 17 to " + $$0 + " require a " + $$4 + " field. Add \"" + $$4 + "\": [" + $$5 + ", " + $$0 + "] or require a version greater or equal to " + ($$0 + 1) + ".0.");
                }
                if ($$1) {
                    if (this.d.isPresent()) {
                        String $$9 = this.a($$5, $$6);
                        if ($$9 != null) {
                            return DataResult.error(() -> $$9);
                        }
                    } else {
                        return DataResult.error(() -> $$3 + " declares support for formats up to " + $$0 + ", but game versions supporting formats 17 to " + $$0 + " require a pack_format field. Add \"pack_format\": " + $$5 + " or require a version greater or equal to " + ($$0 + 1) + ".0.");
                    }
                }
            }
            return DataResult.success(new bfz<azz>(this.b.get(), this.c.get()));
        }

        private DataResult<bfz<azz>> a(int $$0, boolean $$1, String $$2, String $$3) {
            bfz<Integer> $$4 = this.e.get();
            int $$5 = $$4.a();
            int $$6 = $$4.b();
            if ($$6 > $$0) {
                return DataResult.error(() -> $$2 + " declares support for version newer than " + $$0 + ", but is missing mandatory fields min_format and max_format");
            }
            if ($$1) {
                if (this.d.isPresent()) {
                    String $$7 = this.a($$5, $$6);
                    if ($$7 != null) {
                        return DataResult.error(() -> $$7);
                    }
                } else {
                    return DataResult.error(() -> $$2 + " declares support for formats up to " + $$0 + ", but game versions supporting formats 17 to " + $$0 + " require a pack_format field. Add \"pack_format\": " + $$5 + " or require a version greater or equal to " + ($$0 + 1) + ".0.");
                }
            }
            return DataResult.success(new bfz<Integer>($$5, $$6).a(azz::a));
        }

        private @Nullable String a(int $$0, int $$1) {
            int $$2 = this.d.get();
            if ($$2 < $$0 || $$2 > $$1) {
                return "Pack declared support for versions " + $$0 + " to " + $$1 + " but declared main format is " + $$2;
            }
            if ($$2 < 15) {
                return "Multi-version packs cannot support minimum version of less than 15, since this will leave versions in range unable to load pack.";
            }
            return null;
        }

        @Override
        public final String toString() {
            return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "min;max;format;supported", "b", "c", "d", "e"}, this);
        }

        @Override
        public final int hashCode() {
            return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "min;max;format;supported", "b", "c", "d", "e"}, this);
        }

        @Override
        public final boolean equals(Object $$0) {
            return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "min;max;format;supported", "b", "c", "d", "e"}, this, $$0);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMultimap
 *  com.google.common.collect.ImmutableMultimap$Builder
 *  com.google.common.collect.Multimap
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonSyntaxException
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  org.joml.Quaternionfc
 *  org.joml.Vector3fc
 */
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import org.joml.Quaternionfc;
import org.joml.Vector3fc;

public interface aam {
    public static final int a = 65536;
    public static final aao<ByteBuf, Boolean> b = new aao<ByteBuf, Boolean>(){

        public Boolean a(ByteBuf $$0) {
            return $$0.readBoolean();
        }

        public void a(ByteBuf $$0, Boolean $$1) {
            $$0.writeBoolean($$1.booleanValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Boolean)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Byte> c = new aao<ByteBuf, Byte>(){

        public Byte a(ByteBuf $$0) {
            return $$0.readByte();
        }

        public void a(ByteBuf $$0, Byte $$1) {
            $$0.writeByte((int)$$1.byteValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Byte)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Float> d = c.a(bgj::a, bgj::e);
    public static final aao<ByteBuf, Short> e = new aao<ByteBuf, Short>(){

        public Short a(ByteBuf $$0) {
            return $$0.readShort();
        }

        public void a(ByteBuf $$0, Short $$1) {
            $$0.writeShort((int)$$1.shortValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Short)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Integer> f = new aao<ByteBuf, Integer>(){

        public Integer a(ByteBuf $$0) {
            return $$0.readUnsignedShort();
        }

        public void a(ByteBuf $$0, Integer $$1) {
            $$0.writeShort($$1.intValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Integer)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Integer> g = new aao<ByteBuf, Integer>(){

        public Integer a(ByteBuf $$0) {
            return $$0.readInt();
        }

        public void a(ByteBuf $$0, Integer $$1) {
            $$0.writeInt($$1.intValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Integer)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Integer> h = new aao<ByteBuf, Integer>(){

        public Integer a(ByteBuf $$0) {
            return xy.a($$0);
        }

        public void a(ByteBuf $$0, Integer $$1) {
            xy.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Integer)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, OptionalInt> i = h.a($$0 -> $$0 == 0 ? OptionalInt.empty() : OptionalInt.of($$0 - 1), $$0 -> $$0.isPresent() ? $$0.getAsInt() + 1 : 0);
    public static final aao<ByteBuf, Long> j = new aao<ByteBuf, Long>(){

        public Long a(ByteBuf $$0) {
            return $$0.readLong();
        }

        public void a(ByteBuf $$0, Long $$1) {
            $$0.writeLong($$1.longValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Long)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Long> k = new aao<ByteBuf, Long>(){

        public Long a(ByteBuf $$0) {
            return xz.a($$0);
        }

        public void a(ByteBuf $$0, Long $$1) {
            xz.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Long)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Float> l = new aao<ByteBuf, Float>(){

        public Float a(ByteBuf $$0) {
            return Float.valueOf($$0.readFloat());
        }

        public void a(ByteBuf $$0, Float $$1) {
            $$0.writeFloat($$1.floatValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Float)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Double> m = new aao<ByteBuf, Double>(){

        public Double a(ByteBuf $$0) {
            return $$0.readDouble();
        }

        public void a(ByteBuf $$0, Double $$1) {
            $$0.writeDouble($$1.doubleValue());
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Double)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, byte[]> n = new aao<ByteBuf, byte[]>(){

        public byte[] a(ByteBuf $$0) {
            return wx.a($$0);
        }

        public void a(ByteBuf $$0, byte[] $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (byte[])object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, long[]> o = new aao<ByteBuf, long[]>(){

        public long[] a(ByteBuf $$0) {
            return wx.b($$0);
        }

        public void a(ByteBuf $$0, long[] $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (long[])object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, String> p = aam.b(Short.MAX_VALUE);
    public static final aao<ByteBuf, vz> q = aam.b(vi::a);
    public static final aao<ByteBuf, vz> r = aam.b(vi::c);
    public static final aao<ByteBuf, uz> s = aam.c(vi::a);
    public static final aao<ByteBuf, uz> t = aam.c(vi::c);
    public static final aao<ByteBuf, Optional<uz>> u = new aao<ByteBuf, Optional<uz>>(){

        public Optional<uz> a(ByteBuf $$0) {
            return Optional.ofNullable(wx.i($$0));
        }

        public void a(ByteBuf $$0, Optional<uz> $$1) {
            wx.a($$0, $$1.orElse(null));
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Optional)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Vector3fc> v = new aao<ByteBuf, Vector3fc>(){

        public Vector3fc a(ByteBuf $$0) {
            return wx.e($$0);
        }

        public void a(ByteBuf $$0, Vector3fc $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Vector3fc)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Quaternionfc> w = new aao<ByteBuf, Quaternionfc>(){

        public Quaternionfc a(ByteBuf $$0) {
            return wx.f($$0);
        }

        public void a(ByteBuf $$0, Quaternionfc $$1) {
            wx.a($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Quaternionfc)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, Integer> x = new aao<ByteBuf, Integer>(){

        public Integer a(ByteBuf $$0) {
            return wx.j($$0);
        }

        public void a(ByteBuf $$0, Integer $$1) {
            wx.b($$0, $$1);
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Integer)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, PropertyMap> y = new aao<ByteBuf, PropertyMap>(){

        public PropertyMap a(ByteBuf $$02) {
            int $$1 = aam.a($$02, 16);
            ImmutableMultimap.Builder $$2 = ImmutableMultimap.builder();
            for (int $$3 = 0; $$3 < $$1; ++$$3) {
                String $$4 = xx.a($$02, 64);
                String $$5 = xx.a($$02, Short.MAX_VALUE);
                String $$6 = wx.a($$02, (? super B $$0) -> xx.a($$0, 1024));
                Property $$7 = new Property($$4, $$5, $$6);
                $$2.put((Object)$$7.name(), (Object)$$7);
            }
            return new PropertyMap((Multimap)$$2.build());
        }

        public void a(ByteBuf $$02, PropertyMap $$12) {
            aam.a($$02, $$12.size(), 16);
            for (Property $$2 : $$12.values()) {
                xx.a($$02, $$2.name(), 64);
                xx.a($$02, $$2.value(), Short.MAX_VALUE);
                wx.a($$02, $$2.signature(), (? super B $$0, T $$1) -> xx.a($$0, $$1, 1024));
            }
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (PropertyMap)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };
    public static final aao<ByteBuf, String> z = aam.b(16);
    public static final aao<ByteBuf, GameProfile> A = aao.a(jx.g, GameProfile::id, z, GameProfile::name, y, GameProfile::properties, GameProfile::new);
    public static final aao<ByteBuf, Integer> B = new aao<ByteBuf, Integer>(){

        public Integer a(ByteBuf $$0) {
            return bel.a($$0.readByte() & 0xFF, $$0.readByte() & 0xFF, $$0.readByte() & 0xFF);
        }

        public void a(ByteBuf $$0, Integer $$1) {
            $$0.writeByte(bel.c($$1));
            $$0.writeByte(bel.d($$1));
            $$0.writeByte(bel.e($$1));
        }

        @Override
        public /* synthetic */ void encode(Object object, Object object2) {
            this.a((ByteBuf)object, (Integer)object2);
        }

        @Override
        public /* synthetic */ Object decode(Object object) {
            return this.a((ByteBuf)object);
        }
    };

    public static aao<ByteBuf, byte[]> a(final int $$0) {
        return new aao<ByteBuf, byte[]>(){

            public byte[] a(ByteBuf $$02) {
                return wx.a($$02, $$0);
            }

            public void a(ByteBuf $$02, byte[] $$1) {
                if ($$1.length > $$0) {
                    throw new EncoderException("ByteArray with size " + $$1.length + " is bigger than allowed " + $$0);
                }
                wx.a($$02, $$1);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (byte[])object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static aao<ByteBuf, String> b(final int $$0) {
        return new aao<ByteBuf, String>(){

            public String a(ByteBuf $$02) {
                return xx.a($$02, $$0);
            }

            public void a(ByteBuf $$02, String $$1) {
                xx.a($$02, $$1, $$0);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (String)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static aao<ByteBuf, Optional<vz>> a(final Supplier<vi> $$0) {
        return new aao<ByteBuf, Optional<vz>>(){

            public Optional<vz> a(ByteBuf $$02) {
                return Optional.ofNullable(wx.a($$02, (vi)$$0.get()));
            }

            public void a(ByteBuf $$02, Optional<vz> $$1) {
                wx.a($$02, $$1.orElse(null));
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (Optional)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static aao<ByteBuf, vz> b(final Supplier<vi> $$0) {
        return new aao<ByteBuf, vz>(){

            public vz a(ByteBuf $$02) {
                vz $$1 = wx.a($$02, (vi)$$0.get());
                if ($$1 == null) {
                    throw new DecoderException("Expected non-null compound tag");
                }
                return $$1;
            }

            public void a(ByteBuf $$02, vz $$1) {
                if ($$1 == vb.b) {
                    throw new EncoderException("Expected non-null compound tag");
                }
                wx.a($$02, $$1);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (vz)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static aao<ByteBuf, uz> c(Supplier<vi> $$02) {
        return aam.b($$02).a($$0 -> {
            if ($$0 instanceof uz) {
                uz $$1 = (uz)$$0;
                return $$1;
            }
            throw new DecoderException("Not a compound tag: " + String.valueOf($$0));
        }, $$0 -> $$0);
    }

    public static <T> aao<ByteBuf, T> a(Codec<T> $$0) {
        return aam.a($$0, vi::c);
    }

    public static <T> aao<ByteBuf, T> b(Codec<T> $$0) {
        return aam.a($$0, vi::a);
    }

    public static <T, B extends ByteBuf, V> aao.a<B, T, V> a(final DynamicOps<T> $$0, final Codec<V> $$1) {
        return $$2 -> new aao<B, V>(){

            public V a(B $$02) {
                Object $$12 = $$2.decode($$02);
                return $$1.parse($$0, $$12).getOrThrow($$1 -> new DecoderException("Failed to decode: " + $$1 + " " + String.valueOf($$12)));
            }

            public void a(B $$02, V $$12) {
                Object $$22 = $$1.encodeStart($$0, $$12).getOrThrow($$1 -> new EncoderException("Failed to encode: " + $$1 + " " + String.valueOf($$12)));
                $$2.encode($$02, $$22);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <T> aao<ByteBuf, T> a(Codec<T> $$0, Supplier<vi> $$1) {
        return aam.b($$1).a(aam.a(vn.a, $$0));
    }

    public static <T> aao<xq, T> c(Codec<T> $$0) {
        return aam.b($$0, vi::c);
    }

    public static <T> aao<xq, T> d(Codec<T> $$0) {
        return aam.b($$0, vi::a);
    }

    public static <T> aao<xq, T> b(final Codec<T> $$0, Supplier<vi> $$1) {
        final aao<ByteBuf, vz> $$2 = aam.b($$1);
        return new aao<xq, T>(){

            public T a(xq $$02) {
                vz $$12 = (vz)$$2.decode($$02);
                ams<vz> $$22 = $$02.G().a(vn.a);
                return $$0.parse($$22, (Object)$$12).getOrThrow($$1 -> new DecoderException("Failed to decode: " + $$1 + " " + String.valueOf($$12)));
            }

            public void a(xq $$02, T $$12) {
                ams<vz> $$22 = $$02.G().a(vn.a);
                vz $$3 = (vz)$$0.encodeStart($$22, $$12).getOrThrow($$1 -> new EncoderException("Failed to encode: " + $$1 + " " + String.valueOf($$12)));
                $$2.encode($$02, $$3);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public static <B extends ByteBuf, V> aao<B, Optional<V>> a(final aao<? super B, V> $$0) {
        return new aao<B, Optional<V>>(){

            public Optional<V> a(B $$02) {
                if ($$02.readBoolean()) {
                    return Optional.of($$0.decode($$02));
                }
                return Optional.empty();
            }

            public void a(B $$02, Optional<V> $$1) {
                if ($$1.isPresent()) {
                    $$02.writeBoolean(true);
                    $$0.encode($$02, $$1.get());
                } else {
                    $$02.writeBoolean(false);
                }
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (Optional)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static int a(ByteBuf $$0, int $$1) {
        int $$2 = xy.a($$0);
        if ($$2 > $$1) {
            throw new DecoderException($$2 + " elements exceeded max size of: " + $$1);
        }
        return $$2;
    }

    public static void a(ByteBuf $$0, int $$1, int $$2) {
        if ($$1 > $$2) {
            throw new EncoderException($$1 + " elements exceeded max size of: " + $$2);
        }
        xy.a($$0, $$1);
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> aao<B, C> a(IntFunction<C> $$0, aao<? super B, V> $$1) {
        return aam.a($$0, $$1, Integer.MAX_VALUE);
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> aao<B, C> a(final IntFunction<C> $$0, final aao<? super B, V> $$1, final int $$2) {
        return new aao<B, C>(){

            public C a(B $$02) {
                int $$12 = aam.a($$02, $$2);
                Collection $$22 = (Collection)$$0.apply(Math.min($$12, 65536));
                for (int $$3 = 0; $$3 < $$12; ++$$3) {
                    $$22.add($$1.decode($$02));
                }
                return $$22;
            }

            public void a(B $$02, C $$12) {
                aam.a($$02, $$12.size(), $$2);
                for (Object $$22 : $$12) {
                    $$1.encode($$02, $$22);
                }
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (Collection)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <B extends ByteBuf, V, C extends Collection<V>> aao.a<B, V, C> a(IntFunction<C> $$0) {
        return $$1 -> aam.a($$0, $$1);
    }

    public static <B extends ByteBuf, V> aao.a<B, V, List<V>> a() {
        return $$0 -> aam.a(ArrayList::new, $$0);
    }

    public static <B extends ByteBuf, V> aao.a<B, V, List<V>> c(int $$0) {
        return $$1 -> aam.a(ArrayList::new, $$1, $$0);
    }

    public static <B extends ByteBuf, K, V, M extends Map<K, V>> aao<B, M> a(IntFunction<? extends M> $$0, aao<? super B, K> $$1, aao<? super B, V> $$2) {
        return aam.a($$0, $$1, $$2, Integer.MAX_VALUE);
    }

    public static <B extends ByteBuf, K, V, M extends Map<K, V>> aao<B, M> a(final IntFunction<? extends M> $$0, final aao<? super B, K> $$1, final aao<? super B, V> $$2, final int $$3) {
        return new aao<B, M>(){

            public void a(B $$02, M $$12) {
                aam.a($$02, $$12.size(), $$3);
                $$12.forEach(($$3, $$4) -> {
                    $$1.encode($$02, $$3);
                    $$2.encode($$02, $$4);
                });
            }

            public M a(B $$02) {
                int $$12 = aam.a($$02, $$3);
                Map $$22 = (Map)$$0.apply(Math.min($$12, 65536));
                for (int $$32 = 0; $$32 < $$12; ++$$32) {
                    Object $$4 = $$1.decode($$02);
                    Object $$5 = $$2.decode($$02);
                    $$22.put($$4, $$5);
                }
                return $$22;
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (Map)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <B extends ByteBuf, L, R> aao<B, Either<L, R>> a(final aao<? super B, L> $$0, final aao<? super B, R> $$1) {
        return new aao<B, Either<L, R>>(){

            @Override
            public Either<L, R> a(B $$02) {
                if ($$02.readBoolean()) {
                    return Either.left($$0.decode($$02));
                }
                return Either.right($$1.decode($$02));
            }

            public void a(B $$02, Either<L, R> $$12) {
                $$12.ifLeft($$2 -> {
                    $$02.writeBoolean(true);
                    $$0.encode($$02, $$2);
                }).ifRight($$2 -> {
                    $$02.writeBoolean(false);
                    $$1.encode($$02, $$2);
                });
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (Either)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <B extends ByteBuf, V> aao.a<B, V, V> a(final int $$0, final BiFunction<B, ByteBuf, B> $$1) {
        return $$2 -> new aao<B, V>(){

            public V a(B $$02) {
                int $$12 = xy.a($$02);
                if ($$12 > $$0) {
                    throw new DecoderException("Buffer size " + $$12 + " is larger than allowed limit of " + $$0);
                }
                int $$22 = $$02.readerIndex();
                ByteBuf $$3 = (ByteBuf)$$1.apply($$02, $$02.slice($$22, $$12));
                $$02.readerIndex($$22 + $$12);
                return $$2.decode($$3);
            }

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public void a(B $$02, V $$12) {
                ByteBuf $$22 = (ByteBuf)$$1.apply($$02, $$02.alloc().buffer());
                try {
                    $$2.encode($$22, $$12);
                    int $$3 = $$22.readableBytes();
                    if ($$3 > $$0) {
                        throw new EncoderException("Buffer size " + $$3 + " is  larger than allowed limit of " + $$0);
                    }
                    xy.a($$02, $$3);
                    $$02.writeBytes($$22);
                }
                finally {
                    $$22.release();
                }
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <V> aao.a<ByteBuf, V, V> d(int $$02) {
        return aam.a($$02, (B $$0, ByteBuf $$1) -> $$1);
    }

    public static <V> aao.a<xq, V, V> e(int $$02) {
        return aam.a($$02, (B $$0, ByteBuf $$1) -> new xq((ByteBuf)$$1, $$0.G()));
    }

    public static <T> aao<ByteBuf, T> a(final IntFunction<T> $$0, final ToIntFunction<T> $$1) {
        return new aao<ByteBuf, T>(){

            public T a(ByteBuf $$02) {
                int $$12 = xy.a($$02);
                return $$0.apply($$12);
            }

            public void a(ByteBuf $$02, T $$12) {
                int $$2 = $$1.applyAsInt($$12);
                xy.a($$02, $$2);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }

    public static <T> aao<ByteBuf, T> a(ji<T> $$0) {
        return aam.a($$0::b, $$0::c);
    }

    private static <T, R> aao<xq, R> a(final amt<? extends jq<T>> $$0, final Function<jq<T>, ji<R>> $$1) {
        return new aao<xq, R>(){

            private ji<R> b(xq $$02) {
                return (ji)$$1.apply($$02.G().f($$0));
            }

            public R a(xq $$02) {
                int $$12 = xy.a($$02);
                return this.b($$02).b($$12);
            }

            public void a(xq $$02, R $$12) {
                int $$2 = this.b($$02).c($$12);
                xy.a($$02, $$2);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public static <T> aao<xq, T> a(amt<? extends jq<T>> $$02) {
        return aam.a($$02, (jq<T> $$0) -> $$0);
    }

    public static <T> aao<xq, jd<T>> b(amt<? extends jq<T>> $$0) {
        return aam.a($$0, jq::t);
    }

    public static <T> aao<xq, jd<T>> a(final amt<? extends jq<T>> $$0, final aao<? super xq, T> $$1) {
        return new aao<xq, jd<T>>(){
            private static final int c = 0;

            private ji<jd<T>> b(xq $$02) {
                return $$02.G().f($$0).t();
            }

            public jd<T> a(xq $$02) {
                int $$12 = xy.a($$02);
                if ($$12 == 0) {
                    return jd.a($$1.decode($$02));
                }
                return this.b($$02).b($$12 - 1);
            }

            public void a(xq $$02, jd<T> $$12) {
                switch ($$12.f()) {
                    case a: {
                        int $$2 = this.b($$02).c($$12);
                        xy.a($$02, $$2 + 1);
                        break;
                    }
                    case b: {
                        xy.a($$02, 0);
                        $$1.encode($$02, $$12.a());
                    }
                }
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), (jd)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public static <T> aao<xq, jh<T>> c(final amt<? extends jq<T>> $$0) {
        return new aao<xq, jh<T>>(){
            private static final int b = -1;
            private final aao<xq, jd<T>> c;
            {
                this.c = aam.b($$0);
            }

            public jh<T> a(xq $$02) {
                int $$1 = xy.a($$02) - 1;
                if ($$1 == -1) {
                    jq $$2 = $$02.G().f($$0);
                    return (jh)$$2.a(bef.a($$0, (amo)amo.b.decode($$02))).orElseThrow();
                }
                ArrayList<jd> $$3 = new ArrayList<jd>(Math.min($$1, 65536));
                for (int $$4 = 0; $$4 < $$1; ++$$4) {
                    $$3.add((jd)this.c.decode($$02));
                }
                return jh.a($$3);
            }

            public void a(xq $$02, jh<T> $$1) {
                Optional $$2 = $$1.e();
                if ($$2.isPresent()) {
                    xy.a($$02, 0);
                    amo.b.encode($$02, $$2.get().b());
                } else {
                    xy.a($$02, $$1.b() + 1);
                    for (jd jd2 : $$1) {
                        this.c.encode($$02, jd2);
                    }
                }
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((xq)((Object)object), (jh)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((xq)((Object)object));
            }
        };
    }

    public static aao<ByteBuf, JsonElement> f(final int $$0) {
        return new aao<ByteBuf, JsonElement>(){
            private static final Gson b = new GsonBuilder().disableHtmlEscaping().create();

            public JsonElement a(ByteBuf $$02) {
                String $$1 = xx.a($$02, $$0);
                try {
                    return bge.a($$1);
                }
                catch (JsonSyntaxException $$2) {
                    throw new DecoderException("Failed to parse JSON", (Throwable)$$2);
                }
            }

            public void a(ByteBuf $$02, JsonElement $$1) {
                String $$2 = b.toJson($$1);
                xx.a($$02, $$2, $$0);
            }

            @Override
            public /* synthetic */ void encode(Object object, Object object2) {
                this.a((ByteBuf)object, (JsonElement)object2);
            }

            @Override
            public /* synthetic */ Object decode(Object object) {
                return this.a((ByteBuf)object);
            }
        };
    }
}


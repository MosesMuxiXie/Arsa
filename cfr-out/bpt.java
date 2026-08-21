/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class bpt
extends DataFix {
    private static final Logger a = LogUtils.getLogger();

    public bpt(Schema $$0) {
        super($$0, true);
    }

    protected TypeRewriteRule makeRule() {
        Type $$0 = this.getInputSchema().getType(bqh.C);
        Type $$1 = this.getOutputSchema().getType(bqh.C);
        return this.writeFixAndRead("ParticleUnflatteningFix", $$0, $$1, this::a);
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0) {
        Optional $$1 = $$0.asString().result();
        if ($$1.isEmpty()) {
            return $$0;
        }
        String $$2 = (String)$$1.get();
        String[] $$3 = $$2.split(" ", 2);
        String $$4 = bsh.a($$3[0]);
        Dynamic<T> $$5 = $$0.createMap(Map.of($$0.createString("type"), $$0.createString($$4)));
        return switch ($$4) {
            case "minecraft:item" -> {
                if ($$3.length > 1) {
                    yield this.a($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:block", "minecraft:block_marker", "minecraft:falling_dust", "minecraft:dust_pillar" -> {
                if ($$3.length > 1) {
                    yield this.b($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:dust" -> {
                if ($$3.length > 1) {
                    yield this.d($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:dust_color_transition" -> {
                if ($$3.length > 1) {
                    yield this.e($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:sculk_charge" -> {
                if ($$3.length > 1) {
                    yield this.f($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:vibration" -> {
                if ($$3.length > 1) {
                    yield this.g($$5, $$3[1]);
                }
                yield $$5;
            }
            case "minecraft:shriek" -> {
                if ($$3.length > 1) {
                    yield this.h($$5, $$3[1]);
                }
                yield $$5;
            }
            default -> $$5;
        };
    }

    private <T> Dynamic<T> a(Dynamic<T> $$0, String $$1) {
        int $$2 = $$1.indexOf("{");
        Dynamic $$3 = $$0.createMap(Map.of($$0.createString("Count"), $$0.createInt(1)));
        if ($$2 == -1) {
            $$3 = $$3.set("id", $$0.createString($$1));
        } else {
            $$3 = $$3.set("id", $$0.createString($$1.substring(0, $$2)));
            Dynamic<T> $$4 = bpt.a($$0.getOps(), $$1.substring($$2));
            if ($$4 != null) {
                $$3 = $$3.set("tag", $$4);
            }
        }
        return $$0.set("item", $$3);
    }

    private static <T> @Nullable Dynamic<T> a(DynamicOps<T> $$0, String $$1) {
        try {
            return new Dynamic($$0, wa.a($$0).b($$1));
        }
        catch (Exception $$2) {
            a.warn("Failed to parse tag: {}", (Object)$$1, (Object)$$2);
            return null;
        }
    }

    private <T> Dynamic<T> b(Dynamic<T> $$0, String $$1) {
        int $$2 = $$1.indexOf("[");
        Dynamic $$3 = $$0.emptyMap();
        if ($$2 == -1) {
            $$3 = $$3.set("Name", $$0.createString(bsh.a($$1)));
        } else {
            $$3 = $$3.set("Name", $$0.createString(bsh.a($$1.substring(0, $$2))));
            Map<Dynamic<T>, Dynamic<T>> $$4 = bpt.c($$0, $$1.substring($$2));
            if (!$$4.isEmpty()) {
                $$3 = $$3.set("Properties", $$0.createMap($$4));
            }
        }
        return $$0.set("block_state", $$3);
    }

    private static <T> Map<Dynamic<T>, Dynamic<T>> c(Dynamic<T> $$0, String $$1) {
        try {
            HashMap<Dynamic<T>, Dynamic<T>> $$2 = new HashMap<Dynamic<T>, Dynamic<T>>();
            StringReader $$3 = new StringReader($$1);
            $$3.expect('[');
            $$3.skipWhitespace();
            while ($$3.canRead() && $$3.peek() != ']') {
                $$3.skipWhitespace();
                String $$4 = $$3.readString();
                $$3.skipWhitespace();
                $$3.expect('=');
                $$3.skipWhitespace();
                String $$5 = $$3.readString();
                $$3.skipWhitespace();
                $$2.put($$0.createString($$4), $$0.createString($$5));
                if (!$$3.canRead()) continue;
                if ($$3.peek() != ',') break;
                $$3.skip();
            }
            $$3.expect(']');
            return $$2;
        }
        catch (Exception $$6) {
            a.warn("Failed to parse block properties: {}", (Object)$$1, (Object)$$6);
            return Map.of();
        }
    }

    private static <T> Dynamic<T> a(Dynamic<T> $$0, StringReader $$1) throws CommandSyntaxException {
        float $$2 = $$1.readFloat();
        $$1.expect(' ');
        float $$3 = $$1.readFloat();
        $$1.expect(' ');
        float $$4 = $$1.readFloat();
        return $$0.createList(Stream.of(Float.valueOf($$2), Float.valueOf($$3), Float.valueOf($$4)).map(arg_0 -> $$0.createFloat(arg_0)));
    }

    private <T> Dynamic<T> d(Dynamic<T> $$0, String $$1) {
        try {
            StringReader $$2 = new StringReader($$1);
            Dynamic<T> $$3 = bpt.a($$0, $$2);
            $$2.expect(' ');
            float $$4 = $$2.readFloat();
            return $$0.set("color", $$3).set("scale", $$0.createFloat($$4));
        }
        catch (Exception $$5) {
            a.warn("Failed to parse particle options: {}", (Object)$$1, (Object)$$5);
            return $$0;
        }
    }

    private <T> Dynamic<T> e(Dynamic<T> $$0, String $$1) {
        try {
            StringReader $$2 = new StringReader($$1);
            Dynamic<T> $$3 = bpt.a($$0, $$2);
            $$2.expect(' ');
            float $$4 = $$2.readFloat();
            $$2.expect(' ');
            Dynamic<T> $$5 = bpt.a($$0, $$2);
            return $$0.set("from_color", $$3).set("to_color", $$5).set("scale", $$0.createFloat($$4));
        }
        catch (Exception $$6) {
            a.warn("Failed to parse particle options: {}", (Object)$$1, (Object)$$6);
            return $$0;
        }
    }

    private <T> Dynamic<T> f(Dynamic<T> $$0, String $$1) {
        try {
            StringReader $$2 = new StringReader($$1);
            float $$3 = $$2.readFloat();
            return $$0.set("roll", $$0.createFloat($$3));
        }
        catch (Exception $$4) {
            a.warn("Failed to parse particle options: {}", (Object)$$1, (Object)$$4);
            return $$0;
        }
    }

    private <T> Dynamic<T> g(Dynamic<T> $$0, String $$1) {
        try {
            StringReader $$2 = new StringReader($$1);
            float $$3 = (float)$$2.readDouble();
            $$2.expect(' ');
            float $$4 = (float)$$2.readDouble();
            $$2.expect(' ');
            float $$5 = (float)$$2.readDouble();
            $$2.expect(' ');
            int $$6 = $$2.readInt();
            Dynamic $$7 = $$0.createIntList(IntStream.of(bgj.b($$3), bgj.b($$4), bgj.b($$5)));
            Dynamic $$8 = $$0.createMap(Map.of($$0.createString("type"), $$0.createString("minecraft:block"), $$0.createString("pos"), $$7));
            return $$0.set("destination", $$8).set("arrival_in_ticks", $$0.createInt($$6));
        }
        catch (Exception $$9) {
            a.warn("Failed to parse particle options: {}", (Object)$$1, (Object)$$9);
            return $$0;
        }
    }

    private <T> Dynamic<T> h(Dynamic<T> $$0, String $$1) {
        try {
            StringReader $$2 = new StringReader($$1);
            int $$3 = $$2.readInt();
            return $$0.set("delay", $$0.createInt($$3));
        }
        catch (Exception $$4) {
            a.warn("Failed to parse particle options: {}", (Object)$$1, (Object)$$4);
            return $$0;
        }
    }
}


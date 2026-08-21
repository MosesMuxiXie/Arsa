/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  org.slf4j.Logger
 */
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;

public abstract class bbd<T>
extends bbe<Map<amo, T>> {
    private static final Logger a = LogUtils.getLogger();
    private final DynamicOps<JsonElement> b;
    private final Codec<T> c;
    private final amm d;

    protected bbd(jf.a $$0, Codec<T> $$1, amt<? extends jq<T>> $$2) {
        this($$0.a(JsonOps.INSTANCE), $$1, amm.a($$2));
    }

    protected bbd(Codec<T> $$0, amm $$1) {
        this((DynamicOps<JsonElement>)JsonOps.INSTANCE, $$0, $$1);
    }

    private bbd(DynamicOps<JsonElement> $$0, Codec<T> $$1, amm $$2) {
        this.b = $$0;
        this.c = $$1;
        this.d = $$2;
    }

    protected Map<amo, T> a(baz $$0, bzm $$1) {
        HashMap $$2 = new HashMap();
        bbd.a($$0, this.d, this.b, this.c, $$2);
        return $$2;
    }

    public static <T> void a(baz $$0, amt<? extends jq<T>> $$1, DynamicOps<JsonElement> $$2, Codec<T> $$3, Map<amo, T> $$4) {
        bbd.a($$0, amm.a($$1), $$2, $$3, $$4);
    }

    public static <T> void a(baz $$0, amm $$1, DynamicOps<JsonElement> $$22, Codec<T> $$3, Map<amo, T> $$4) {
        for (Map.Entry<amo, bax> $$5 : $$1.a($$0).entrySet()) {
            amo $$6 = $$5.getKey();
            amo $$7 = $$1.b($$6);
            try {
                BufferedReader $$8 = $$5.getValue().e();
                try {
                    $$3.parse($$22, (Object)bhf.a($$8)).ifSuccess($$2 -> {
                        if ($$4.putIfAbsent($$7, $$2) != null) {
                            throw new IllegalStateException("Duplicate data file ignored with ID " + String.valueOf($$7));
                        }
                    }).ifError($$2 -> a.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{$$7, $$6, $$2}));
                }
                finally {
                    if ($$8 == null) continue;
                    ((Reader)$$8).close();
                }
            }
            catch (JsonParseException | IOException | IllegalArgumentException $$9) {
                a.error("Couldn't parse data file '{}' from '{}'", new Object[]{$$7, $$6, $$9});
            }
        }
    }

    @Override
    protected /* synthetic */ Object b(baz baz2, bzm bzm2) {
        return this.a(baz2, bzm2);
    }
}


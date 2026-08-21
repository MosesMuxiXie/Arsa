/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Const$PrimitiveType
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.PrimitiveCodec
 */
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class bsh
extends Schema {
    public static final PrimitiveCodec<String> a = new PrimitiveCodec<String>(){

        public <T> DataResult<String> read(DynamicOps<T> $$0, T $$1) {
            return $$0.getStringValue($$1).map(bsh::a);
        }

        public <T> T a(DynamicOps<T> $$0, String $$1) {
            return (T)$$0.createString($$1);
        }

        public String toString() {
            return "NamespacedString";
        }

        public /* synthetic */ Object write(DynamicOps dynamicOps, Object object) {
            return this.a(dynamicOps, (String)object);
        }
    };
    private static final Type<String> b = new Const.PrimitiveType(a);

    public bsh(int $$0, Schema $$1) {
        super($$0, $$1);
    }

    public static String a(String $$0) {
        amo $$1 = amo.c($$0);
        if ($$1 != null) {
            return $$1.toString();
        }
        return $$0;
    }

    public static Type<String> a() {
        return b;
    }

    public Type<?> getChoiceType(DSL.TypeReference $$0, String $$1) {
        return super.getChoiceType($$0, bsh.a($$1));
    }
}


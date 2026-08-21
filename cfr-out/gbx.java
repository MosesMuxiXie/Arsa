/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class gbx {
    public String toString() {
        StringBuilder $$0 = new StringBuilder("{");
        for (Field $$1 : this.getClass().getFields()) {
            if (gbx.b($$1)) continue;
            try {
                $$0.append(gbx.a($$1)).append("=").append($$1.get(this)).append(" ");
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
        }
        $$0.deleteCharAt($$0.length() - 1);
        $$0.append('}');
        return $$0.toString();
    }

    private static String a(Field $$0) {
        SerializedName $$1 = $$0.getAnnotation(SerializedName.class);
        return $$1 != null ? $$1.value() : $$0.getName();
    }

    private static boolean b(Field $$0) {
        return Modifier.isStatic($$0.getModifiers());
    }
}


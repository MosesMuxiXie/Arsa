/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
import com.google.common.collect.Maps;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class ir {
    private static final Map<iz, i> a = Maps.newEnumMap(Map.of(iz.d, i.a(), iz.f, new i(null, (Quaternionfc)new Quaternionf().rotateY(1.5707964f), null, null), iz.e, new i(null, (Quaternionfc)new Quaternionf().rotateY(-1.5707964f), null, null), iz.c, new i(null, (Quaternionfc)new Quaternionf().rotateY((float)Math.PI), null, null), iz.b, new i(null, (Quaternionfc)new Quaternionf().rotateX(-1.5707964f), null, null), iz.a, new i(null, (Quaternionfc)new Quaternionf().rotateX(1.5707964f), null, null)));
    private static final Map<iz, i> b = Maps.newEnumMap(bhs.a(a, i::b));

    public static i a(i $$0) {
        Matrix4f $$1 = new Matrix4f().translation(0.5f, 0.5f, 0.5f);
        $$1.mul($$0.c());
        $$1.translate(-0.5f, -0.5f, -0.5f);
        return new i((Matrix4fc)$$1);
    }

    public static i b(i $$0) {
        Matrix4f $$1 = new Matrix4f().translation(-0.5f, -0.5f, -0.5f);
        $$1.mul($$0.c());
        $$1.translate(0.5f, 0.5f, 0.5f);
        return new i((Matrix4fc)$$1);
    }

    public static i a(i $$0, iz $$1) {
        if (e.a($$0.c())) {
            return $$0;
        }
        i $$2 = a.get($$1);
        $$2 = $$0.a($$2);
        Vector3f $$3 = $$2.c().transformDirection(new Vector3f(0.0f, 0.0f, 1.0f));
        iz $$4 = iz.a($$3.x, $$3.y, $$3.z);
        return b.get($$4).a($$2);
    }
}


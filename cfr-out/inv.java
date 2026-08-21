/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
import java.util.List;
import java.util.Map;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class inv {
    private static final String b = "missingno";
    public static final amo a = amo.b("builtin/missing");

    public static ioi a() {
        hqc.b $$0 = new hqc.b(0.0f, 0.0f, 16.0f, 16.0f);
        Map<iz, hqc> $$12 = bhs.a(iz.class, (K $$1) -> new hqc((iz)$$1, -1, b, $$0, g.a));
        hqb $$2 = new hqb((Vector3fc)new Vector3f(0.0f, 0.0f, 0.0f), (Vector3fc)new Vector3f(16.0f, 16.0f, 16.0f), $$12);
        return new hqe(new hqn(List.of($$2)), null, null, hql.a, new hqp.a.a().a("particle", b).a(b, new ins(ilo.d, ilf.c())).a(), null);
    }
}


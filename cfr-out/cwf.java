/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;

public class cwf {
    private static final cwe a = new cwe(bda.gF, bda.gx, bda.gy, bda.gw, amo.b("textures/entity/copper_golem/copper_golem.png"), amo.b("textures/entity/copper_golem/copper_golem_eyes.png"));
    private static final cwe b = new cwe(bda.gF, bda.gx, bda.gy, bda.gw, amo.b("textures/entity/copper_golem/exposed_copper_golem.png"), amo.b("textures/entity/copper_golem/exposed_copper_golem_eyes.png"));
    private static final cwe c = new cwe(bda.gG, bda.gA, bda.gB, bda.gz, amo.b("textures/entity/copper_golem/weathered_copper_golem.png"), amo.b("textures/entity/copper_golem/weathered_copper_golem_eyes.png"));
    private static final cwe d = new cwe(bda.gH, bda.gD, bda.gE, bda.gC, amo.b("textures/entity/copper_golem/oxidized_copper_golem.png"), amo.b("textures/entity/copper_golem/oxidized_copper_golem_eyes.png"));
    private static final Map<ejq.a, cwe> e = Map.of(ejq.a.a, a, ejq.a.b, b, ejq.a.c, c, ejq.a.d, d);

    public static cwe a(ejq.a $$0) {
        return e.get($$0);
    }
}


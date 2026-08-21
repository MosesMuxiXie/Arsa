/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
import org.jspecify.annotations.Nullable;

public class ifx
extends ieh {
    private static final amo j = amo.b("textures/entity/wolf/wolf.png");
    public boolean a;
    public boolean b;
    public float c = 0.62831855f;
    public float d;
    public float e;
    public float f = 1.0f;
    public amo g = j;
    public @Nullable dkr h;
    public dlt i = dlt.l;

    public float a(float $$0) {
        float $$1 = (this.e + $$0) / 1.8f;
        if ($$1 < 0.0f) {
            $$1 = 0.0f;
        } else if ($$1 > 1.0f) {
            $$1 = 1.0f;
        }
        return bgj.a((double)($$1 * (float)Math.PI)) * bgj.a((double)($$1 * (float)Math.PI * 11.0f)) * 0.15f * (float)Math.PI;
    }
}


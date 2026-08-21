/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.openal.AL10
 */
import org.lwjgl.openal.AL10;

public class fwi {
    private fwj a = fwj.a;

    public void a(fwj $$0) {
        this.a = $$0;
        ftm $$1 = $$0.b();
        ftm $$2 = $$0.c();
        ftm $$3 = $$0.d();
        AL10.alListener3f((int)4100, (float)((float)$$1.g), (float)((float)$$1.h), (float)((float)$$1.i));
        AL10.alListenerfv((int)4111, (float[])new float[]{(float)$$2.g, (float)$$2.h, (float)$$2.i, (float)$$3.a(), (float)$$3.b(), (float)$$3.c()});
    }

    public void a() {
        this.a(fwj.a);
    }

    public fwj b() {
        return this.a;
    }
}


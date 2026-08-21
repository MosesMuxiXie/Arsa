/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public interface dib
extends ccv,
djn {
    public int aB_();

    public int h();

    public List<dlt> i();

    default public dqg aE_() {
        return this.aF_().a();
    }

    default public dqg.a aF_() {
        return dqg.b(this.aB_(), this.h(), this.i());
    }
}


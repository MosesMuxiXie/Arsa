/*
 * Decompiled with CFR 0.152.
 */
public interface cgd {
    public boolean a(elp var1, is var2);

    public double ar();

    default public chl k_() {
        if (this instanceof chl) {
            return (chl)((Object)this);
        }
        throw new IllegalStateException("A container user must be a LivingEntity");
    }
}


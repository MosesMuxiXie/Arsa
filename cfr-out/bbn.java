/*
 * Decompiled with CFR 0.152.
 */
public interface bbn {
    public static final bbn g = $$0 -> false;
    public static final bbn h = $$0 -> true;

    public boolean hasPermission(bbi var1);

    default public bbn a(bbn $$0) {
        if ($$0 instanceof bbp) {
            return $$0.a(this);
        }
        return new bbp(this, $$0);
    }
}


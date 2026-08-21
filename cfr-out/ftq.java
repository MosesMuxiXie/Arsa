/*
 * Decompiled with CFR 0.152.
 */
public interface ftq {
    public static final ftq a = ($$0, $$1) -> false;
    public static final ftq b = ($$0, $$1) -> !$$0 && !$$1;
    public static final ftq c = ($$0, $$1) -> $$1 && !$$0;
    public static final ftq d = ($$0, $$1) -> !$$0;
    public static final ftq e = ($$0, $$1) -> $$0 && !$$1;
    public static final ftq f = ($$0, $$1) -> !$$1;
    public static final ftq g = ($$0, $$1) -> $$0 != $$1;
    public static final ftq h = ($$0, $$1) -> !$$0 || !$$1;
    public static final ftq i = ($$0, $$1) -> $$0 && $$1;
    public static final ftq j = ($$0, $$1) -> $$0 == $$1;
    public static final ftq k = ($$0, $$1) -> $$1;
    public static final ftq l = ($$0, $$1) -> !$$0 || $$1;
    public static final ftq m = ($$0, $$1) -> $$0;
    public static final ftq n = ($$0, $$1) -> $$0 || !$$1;
    public static final ftq o = ($$0, $$1) -> $$0 || $$1;
    public static final ftq p = ($$0, $$1) -> true;

    public boolean apply(boolean var1, boolean var2);
}


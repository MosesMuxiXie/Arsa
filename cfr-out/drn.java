/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public interface drn
extends dqs<dro> {
    @Override
    default public drd<drn> b() {
        return drd.g;
    }

    @Override
    public drc<? extends drn> a();

    @Override
    default public boolean a(dro $$0, dwo $$1) {
        return dqo.a(this.c(), $$0.c()) && this.f().a($$0.d()) && dqo.a(this.k(), $$0.e());
    }

    public Optional<dqo> c();

    public dqo f();

    public Optional<dqo> k();

    @Override
    default public dqv h() {
        return dqu.l;
    }
}

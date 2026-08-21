/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
import com.google.common.collect.ImmutableList;
import java.util.List;

public interface gpd {
    default public void a(gpc $$0, yh $$1) {
        this.a($$0, gpf.a($$1.getString()));
    }

    default public void a(gpc $$0, String $$1) {
        this.a($$0, gpf.a($$1));
    }

    default public void a(gpc $$0, yh ... $$1) {
        this.a($$0, gpf.a((List<yh>)ImmutableList.copyOf((Object[])$$1)));
    }

    public void a(gpc var1, gpf<?> var2);

    public gpd a();
}


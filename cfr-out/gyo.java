/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.util.List;

public class gyo
implements gyq {
    private static final yh a = yh.c("spectatorMenu.root.prompt");
    private final List<gyr> b = Lists.newArrayList();

    public gyo() {
        this.b.add(new gyu());
        this.b.add(new gyv());
    }

    @Override
    public List<gyr> a() {
        return this.b;
    }

    @Override
    public yh b() {
        return a;
    }
}


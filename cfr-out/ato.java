/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;
import javax.swing.JList;
import net.minecraft.server.MinecraftServer;

public class ato
extends JList<String> {
    private final MinecraftServer a;
    private int b;

    public ato(MinecraftServer $$0) {
        this.a = $$0;
        $$0.b(this::a);
    }

    public void a() {
        if (this.b++ % 20 == 0) {
            Vector<String> $$0 = new Vector<String>();
            for (int $$1 = 0; $$1 < this.a.aj().t().size(); ++$$1) {
                $$0.add(this.a.aj().t().get($$1).gI().name());
            }
            this.setListData($$0);
        }
    }
}


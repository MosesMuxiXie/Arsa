/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogQueues
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 */
import com.google.common.collect.Lists;
import com.mojang.logging.LogQueues;
import com.mojang.logging.LogUtils;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.slf4j.Logger;

public class atn
extends JComponent {
    private static final Font a = new Font("Monospaced", 0, 12);
    private static final Logger b = LogUtils.getLogger();
    private static final String c = "Minecraft server";
    private static final String d = "Minecraft server - shutting down!";
    private final ary e;
    private Thread f;
    private final Collection<Runnable> g = Lists.newArrayList();
    final AtomicBoolean h = new AtomicBoolean();

    public static atn a(final ary $$0) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception exception) {
            // empty catch block
        }
        final JFrame $$1 = new JFrame(c);
        final atn $$2 = new atn($$0);
        $$1.setDefaultCloseOperation(2);
        $$1.add($$2);
        $$1.pack();
        $$1.setLocationRelativeTo(null);
        $$1.setVisible(true);
        $$1.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent $$02) {
                if (!$$2.h.getAndSet(true)) {
                    $$1.setTitle(atn.d);
                    $$0.a(true);
                    $$2.f();
                }
            }
        });
        $$2.a($$1::dispose);
        $$2.a();
        return $$2;
    }

    private atn(ary $$0) {
        this.e = $$0;
        this.setPreferredSize(new Dimension(854, 480));
        this.setLayout(new BorderLayout());
        try {
            this.add((Component)this.e(), "Center");
            this.add((Component)this.c(), "West");
        }
        catch (Exception $$1) {
            b.error("Couldn't build server GUI", (Throwable)$$1);
        }
    }

    public void a(Runnable $$0) {
        this.g.add($$0);
    }

    private JComponent c() {
        JPanel $$0 = new JPanel(new BorderLayout());
        atp $$1 = new atp(this.e);
        this.g.add($$1::a);
        $$0.add((Component)$$1, "North");
        $$0.add((Component)this.d(), "Center");
        $$0.setBorder(new TitledBorder(new EtchedBorder(), "Stats"));
        return $$0;
    }

    private JComponent d() {
        ato $$0 = new ato(this.e);
        JScrollPane $$1 = new JScrollPane($$0, 22, 30);
        $$1.setBorder(new TitledBorder(new EtchedBorder(), "Players"));
        return $$1;
    }

    private JComponent e() {
        JPanel $$0 = new JPanel(new BorderLayout());
        JTextArea $$12 = new JTextArea();
        JScrollPane $$2 = new JScrollPane($$12, 22, 30);
        $$12.setEditable(false);
        $$12.setFont(a);
        JTextField $$3 = new JTextField();
        $$3.addActionListener($$1 -> {
            String $$2 = $$3.getText().trim();
            if (!$$2.isEmpty()) {
                this.e.a($$2, this.e.aG());
            }
            $$3.setText("");
        });
        $$12.addFocusListener(new FocusAdapter(this){

            @Override
            public void focusGained(FocusEvent $$0) {
            }
        });
        $$0.add((Component)$$2, "Center");
        $$0.add((Component)$$3, "South");
        $$0.setBorder(new TitledBorder(new EtchedBorder(), "Log and chat"));
        this.f = new Thread(() -> {
            String $$2;
            while (($$2 = LogQueues.getNextLogEvent((String)"ServerGuiConsole")) != null) {
                this.a($$12, $$2, $$2);
            }
        });
        this.f.setUncaughtExceptionHandler(new p(b));
        this.f.setDaemon(true);
        return $$0;
    }

    public void a() {
        this.f.start();
    }

    public void b() {
        if (!this.h.getAndSet(true)) {
            this.f();
        }
    }

    void f() {
        this.g.forEach(Runnable::run);
    }

    public void a(JTextArea $$0, JScrollPane $$1, String $$2) {
        if (!SwingUtilities.isEventDispatchThread()) {
            SwingUtilities.invokeLater(() -> this.a($$0, $$1, $$2));
            return;
        }
        Document $$3 = $$0.getDocument();
        JScrollBar $$4 = $$1.getVerticalScrollBar();
        boolean $$5 = false;
        if ($$1.getViewport().getView() == $$0) {
            $$5 = (double)$$4.getValue() + $$4.getSize().getHeight() + (double)(a.getSize() * 4) > (double)$$4.getMaximum();
        }
        try {
            $$3.insertString($$3.getLength(), $$2, null);
        }
        catch (BadLocationException badLocationException) {
            // empty catch block
        }
        if ($$5) {
            $$4.setValue(Integer.MAX_VALUE);
        }
    }
}


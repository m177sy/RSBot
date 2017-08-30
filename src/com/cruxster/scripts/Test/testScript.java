package com.cruxster.scripts.Test;

import org.powerbot.script.PaintListener;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import java.awt.*;

/**
 * Created by mills on 29/08/2017.
 */
@Script.Manifest(name = "Test Scipt", description = "My way to test the setup...", properties = "client=6; author=Cruxster; topic=999")
public class testScript extends PollingScript<ClientContext> implements PaintListener {



    public void start() {
    }


    @Override
    public void poll() {

    }

    @Override
    public void repaint(Graphics graphics) {

        Graphics2D g = (Graphics2D)graphics;
    }
}

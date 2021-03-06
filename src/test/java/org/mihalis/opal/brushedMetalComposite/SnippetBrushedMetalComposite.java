/*******************************************************************************
 * Copyright (c) 2011 Laurent CARON
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Laurent CARON (laurent.caron at gmail dot com) - initial API and implementation 
 *******************************************************************************/
package org.mihalis.opal.brushedMetalComposite;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * This snippet demonstrates the brushed metal composite
 * 
 */
public class SnippetBrushedMetalComposite {
	public static void main(final String[] args) {
		final Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setBackgroundMode(SWT.INHERIT_DEFAULT);
		final FillLayout layout1 = new FillLayout(SWT.VERTICAL);
		layout1.marginWidth = layout1.marginHeight = 10;
		shell.setLayout(layout1);

		// Displays the composite
		final BrushedMetalComposite bmc = new BrushedMetalComposite(shell, SWT.NONE);

		// And the content
		final RowLayout layout2 = new RowLayout(SWT.VERTICAL);
		layout2.marginWidth = layout2.marginHeight = layout2.spacing = 10;
		bmc.setLayout(layout2);
		for (int i = 0; i < 8; i++) {
			final Button button = new Button(bmc, SWT.RADIO);
			button.setText("Button " + i);
		}

		// Open the shell
		shell.setSize(400, 400);
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

}

/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.office;

import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.element.dc.DcCreatorElement;
import org.odftoolkit.odfdom.dom.element.dc.DcDateElement;
import org.odftoolkit.odfdom.dom.element.text.TextPElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element office:change-info}.
 *
 */
public class OfficeChangeInfoElement extends OdfElement {

	public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.OFFICE, "change-info");

	/**
	 * Create the instance of <code>OfficeChangeInfoElement</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public OfficeChangeInfoElement(OdfFileDom ownerDoc) {
		super(ownerDoc, ELEMENT_NAME);
	}

	/**
	 * Get the element name
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element office:change-info}.
	 */
	public OdfName getOdfName() {
		return ELEMENT_NAME;
	}

	/**
	 * Create child element {@odf.element dc:creator}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element dc:creator}
	 */
	public DcCreatorElement newDcCreatorElement() {
		DcCreatorElement dcCreator = ((OdfFileDom) this.ownerDocument).newOdfElement(DcCreatorElement.class);
		this.appendChild(dcCreator);
		return dcCreator;
	}

	/**
	 * Create child element {@odf.element dc:date}.
	 *
	 * Child element is mandatory.
	 *
	 * @return the element {@odf.element dc:date}
	 */
	public DcDateElement newDcDateElement() {
		DcDateElement dcDate = ((OdfFileDom) this.ownerDocument).newOdfElement(DcDateElement.class);
		this.appendChild(dcDate);
		return dcDate;
	}

	/**
	 * Create child element {@odf.element text:p}.
	 *
	 * @return the element {@odf.element text:p}
	 */
	public TextPElement newTextPElement() {
		TextPElement textP = ((OdfFileDom) this.ownerDocument).newOdfElement(TextPElement.class);
		this.appendChild(textP);
		return textP;
	}

	@Override
	public void accept(ElementVisitor visitor) {
		if (visitor instanceof DefaultElementVisitor) {
			DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
			defaultVisitor.visit(this);
		} else {
			visitor.visit(this);
		}
	}
}

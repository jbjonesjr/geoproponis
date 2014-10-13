
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
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.element.OdfStyleBase;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStyleableShapeElement;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeBooleanValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeCurrencyAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeDateValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeStringValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeTimeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueAttribute;
import org.odftoolkit.odfdom.dom.attribute.office.OfficeValueTypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableContentValidationNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableFormulaAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableNumberColumnsRepeatedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableProtectedAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlAboutAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlContentAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlDatatypeAttribute;
import org.odftoolkit.odfdom.dom.attribute.xhtml.XhtmlPropertyAttribute;
import org.odftoolkit.odfdom.dom.attribute.xml.XmlIdAttribute;

/**
 * DOM implementation of OpenDocument base element
 *
 */
public abstract class TableTableCellElementBase extends OdfStylableElement {

	/**
	 * Create the instance of <code>TableTableCellElementBase</code>
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableTableCellElementBase(OdfFileDom ownerDoc, OdfName elementName, OdfStyleFamily styleFamily, OdfName styleAttrName) {
		super(ownerDoc, elementName, styleFamily, styleAttrName);
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getOfficeBooleanValueAttribute() {
		OfficeBooleanValueAttribute attr = (OfficeBooleanValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "boolean-value");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeBooleanValueAttribute</code> , See {@odf.attribute office:boolean-value}
	 *
	 * @param officeBooleanValueValue   The type is <code>Boolean</code>
	 */
	public void setOfficeBooleanValueAttribute(Boolean officeBooleanValueValue) {
		OfficeBooleanValueAttribute attr = new OfficeBooleanValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(officeBooleanValueValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See {@odf.attribute office:currency}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeCurrencyAttribute() {
		OfficeCurrencyAttribute attr = (OfficeCurrencyAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "currency");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeCurrencyAttribute</code> , See {@odf.attribute office:currency}
	 *
	 * @param officeCurrencyValue   The type is <code>String</code>
	 */
	public void setOfficeCurrencyAttribute(String officeCurrencyValue) {
		OfficeCurrencyAttribute attr = new OfficeCurrencyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeCurrencyValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeDateValueAttribute() {
		OfficeDateValueAttribute attr = (OfficeDateValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "date-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeDateValueAttribute</code> , See {@odf.attribute office:date-value}
	 *
	 * @param officeDateValueValue   The type is <code>String</code>
	 */
	public void setOfficeDateValueAttribute(String officeDateValueValue) {
		OfficeDateValueAttribute attr = new OfficeDateValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeDateValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeStringValueAttribute() {
		OfficeStringValueAttribute attr = (OfficeStringValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "string-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeStringValueAttribute</code> , See {@odf.attribute office:string-value}
	 *
	 * @param officeStringValueValue   The type is <code>String</code>
	 */
	public void setOfficeStringValueAttribute(String officeStringValueValue) {
		OfficeStringValueAttribute attr = new OfficeStringValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeStringValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeTimeValueAttribute() {
		OfficeTimeValueAttribute attr = (OfficeTimeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "time-value");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeTimeValueAttribute</code> , See {@odf.attribute office:time-value}
	 *
	 * @param officeTimeValueValue   The type is <code>String</code>
	 */
	public void setOfficeTimeValueAttribute(String officeTimeValueValue) {
		OfficeTimeValueAttribute attr = new OfficeTimeValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeTimeValueValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getOfficeValueAttribute() {
		OfficeValueAttribute attr = (OfficeValueAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value");
		if (attr != null) {
			return Double.valueOf(attr.doubleValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueAttribute</code> , See {@odf.attribute office:value}
	 *
	 * @param officeValueValue   The type is <code>Double</code>
	 */
	public void setOfficeValueAttribute(Double officeValueValue) {
		OfficeValueAttribute attr = new OfficeValueAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setDoubleValue(officeValueValue.doubleValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getOfficeValueTypeAttribute() {
		OfficeValueTypeAttribute attr = (OfficeValueTypeAttribute) getOdfAttribute(OdfDocumentNamespace.OFFICE, "value-type");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>OfficeValueTypeAttribute</code> , See {@odf.attribute office:value-type}
	 *
	 * @param officeValueTypeValue   The type is <code>String</code>
	 */
	public void setOfficeValueTypeAttribute(String officeValueTypeValue) {
		OfficeValueTypeAttribute attr = new OfficeValueTypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(officeValueTypeValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableContentValidationNameAttribute</code> , See {@odf.attribute table:content-validation-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableContentValidationNameAttribute() {
		TableContentValidationNameAttribute attr = (TableContentValidationNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "content-validation-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableContentValidationNameAttribute</code> , See {@odf.attribute table:content-validation-name}
	 *
	 * @param tableContentValidationNameValue   The type is <code>String</code>
	 */
	public void setTableContentValidationNameAttribute(String tableContentValidationNameValue) {
		TableContentValidationNameAttribute attr = new TableContentValidationNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableContentValidationNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableFormulaAttribute</code> , See {@odf.attribute table:formula}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableFormulaAttribute() {
		TableFormulaAttribute attr = (TableFormulaAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "formula");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableFormulaAttribute</code> , See {@odf.attribute table:formula}
	 *
	 * @param tableFormulaValue   The type is <code>String</code>
	 */
	public void setTableFormulaAttribute(String tableFormulaValue) {
		TableFormulaAttribute attr = new TableFormulaAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableFormulaValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableNumberColumnsRepeatedAttribute</code> , See {@odf.attribute table:number-columns-repeated}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTableNumberColumnsRepeatedAttribute() {
		TableNumberColumnsRepeatedAttribute attr = (TableNumberColumnsRepeatedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "number-columns-repeated");
		if (attr != null) {
			return Integer.valueOf(attr.intValue());
		}
		return Integer.valueOf(TableNumberColumnsRepeatedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableNumberColumnsRepeatedAttribute</code> , See {@odf.attribute table:number-columns-repeated}
	 *
	 * @param tableNumberColumnsRepeatedValue   The type is <code>Integer</code>
	 */
	public void setTableNumberColumnsRepeatedAttribute(Integer tableNumberColumnsRepeatedValue) {
		TableNumberColumnsRepeatedAttribute attr = new TableNumberColumnsRepeatedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setIntValue(tableNumberColumnsRepeatedValue.intValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectAttribute</code> , See {@odf.attribute table:protect}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableProtectAttribute() {
		TableProtectAttribute attr = (TableProtectAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "protect");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableProtectAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectAttribute</code> , See {@odf.attribute table:protect}
	 *
	 * @param tableProtectValue   The type is <code>Boolean</code>
	 */
	public void setTableProtectAttribute(Boolean tableProtectValue) {
		TableProtectAttribute attr = new TableProtectAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableProtectValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getTableProtectedAttribute() {
		TableProtectedAttribute attr = (TableProtectedAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "protected");
		if (attr != null) {
			return Boolean.valueOf(attr.booleanValue());
		}
		return Boolean.valueOf(TableProtectedAttribute.DEFAULT_VALUE);
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableProtectedAttribute</code> , See {@odf.attribute table:protected}
	 *
	 * @param tableProtectedValue   The type is <code>Boolean</code>
	 */
	public void setTableProtectedAttribute(Boolean tableProtectedValue) {
		TableProtectedAttribute attr = new TableProtectedAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setBooleanValue(tableProtectedValue.booleanValue());
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute() {
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute(OdfDocumentNamespace.TABLE, "style-name");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute(String tableStyleNameValue) {
		TableStyleNameAttribute attr = new TableStyleNameAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(tableStyleNameValue);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XhtmlAboutAttribute</code> , See {@odf.attribute xhtml:about}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXhtmlAboutAttribute() {
		XhtmlAboutAttribute attr = (XhtmlAboutAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "about");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XhtmlAboutAttribute</code> , See {@odf.attribute xhtml:about}
	 *
	 * @param xhtmlAboutValue   The type is <code>String</code>
	 */
	public void setXhtmlAboutAttribute(String xhtmlAboutValue) {
		XhtmlAboutAttribute attr = new XhtmlAboutAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xhtmlAboutValue);
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XhtmlContentAttribute</code> , See {@odf.attribute xhtml:content}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXhtmlContentAttribute() {
		XhtmlContentAttribute attr = (XhtmlContentAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "content");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XhtmlContentAttribute</code> , See {@odf.attribute xhtml:content}
	 *
	 * @param xhtmlContentValue   The type is <code>String</code>
	 */
	public void setXhtmlContentAttribute(String xhtmlContentValue) {
		XhtmlContentAttribute attr = new XhtmlContentAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xhtmlContentValue);
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XhtmlDatatypeAttribute</code> , See {@odf.attribute xhtml:datatype}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXhtmlDatatypeAttribute() {
		XhtmlDatatypeAttribute attr = (XhtmlDatatypeAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "datatype");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XhtmlDatatypeAttribute</code> , See {@odf.attribute xhtml:datatype}
	 *
	 * @param xhtmlDatatypeValue   The type is <code>String</code>
	 */
	public void setXhtmlDatatypeAttribute(String xhtmlDatatypeValue) {
		XhtmlDatatypeAttribute attr = new XhtmlDatatypeAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xhtmlDatatypeValue);
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XhtmlPropertyAttribute</code> , See {@odf.attribute xhtml:property}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXhtmlPropertyAttribute() {
		XhtmlPropertyAttribute attr = (XhtmlPropertyAttribute) getOdfAttribute(OdfDocumentNamespace.XHTML, "property");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XhtmlPropertyAttribute</code> , See {@odf.attribute xhtml:property}
	 *
	 * @param xhtmlPropertyValue   The type is <code>String</code>
	 */
	public void setXhtmlPropertyAttribute(String xhtmlPropertyValue) {
		XhtmlPropertyAttribute attr = new XhtmlPropertyAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xhtmlPropertyValue);
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getXmlIdAttribute() {
		XmlIdAttribute attr = (XmlIdAttribute) getOdfAttribute(OdfDocumentNamespace.XML, "id");
		if (attr != null) {
			return String.valueOf(attr.getValue());
		}
		return null;
	}

	/**
	 * Sets the value of ODFDOM attribute representation <code>XmlIdAttribute</code> , See {@odf.attribute xml:id}
	 *
	 * @param xmlIdValue   The type is <code>String</code>
	 */
	public void setXmlIdAttribute(String xmlIdValue) {
		XmlIdAttribute attr = new XmlIdAttribute((OdfFileDom) this.ownerDocument);
		setOdfAttribute(attr);
		attr.setValue(xmlIdValue);
	}
	
	/**
	* Set text content. Only elements which are allowed to have text content offer this method.
	*/
	public void setTextContent(String content){
		super.setTextContent(content);
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}

	protected void onRemoveNode() {
		super.onRemoveNode();
		((OdfFileDom) this.ownerDocument).getInContentMetadataCache().remove(this);
	}

	protected void onInsertNode() {
		super.onInsertNode();
		((OdfFileDom) this.ownerDocument).updateInContentMetadataCache(this);
	}
}

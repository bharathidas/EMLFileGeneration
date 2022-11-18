// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emlfilegeneration.proxies;

public class Attachment extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EMLFileGeneration.Attachment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		Attachment_Email("EMLFileGeneration.Attachment_Email");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Attachment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Attachment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attachmentMendixObject)
	{
		super(context, attachmentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf(entityName, attachmentMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	
	}

	/**
	 * @deprecated Use 'Attachment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emlfilegeneration.proxies.Attachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emlfilegeneration.proxies.Attachment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static emlfilegeneration.proxies.Attachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emlfilegeneration.proxies.Attachment(context, mendixObject);
	}

	public static emlfilegeneration.proxies.Attachment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emlfilegeneration.proxies.Attachment.initialize(context, mendixObject);
	}

	public static java.util.List<emlfilegeneration.proxies.Attachment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> emlfilegeneration.proxies.Attachment.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Attachment_Email
	 */
	public final emlfilegeneration.proxies.Email getAttachment_Email() throws com.mendix.core.CoreException
	{
		return getAttachment_Email(getContext());
	}

	/**
	 * @param context
	 * @return value of Attachment_Email
	 * @throws com.mendix.core.CoreException
	 */
	public final emlfilegeneration.proxies.Email getAttachment_Email(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emlfilegeneration.proxies.Email result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attachment_Email.toString());
		if (identifier != null) {
			result = emlfilegeneration.proxies.Email.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Attachment_Email
	 * @param attachment_email
	 */
	public final void setAttachment_Email(emlfilegeneration.proxies.Email attachment_email)
	{
		setAttachment_Email(getContext(), attachment_email);
	}

	/**
	 * Set value of Attachment_Email
	 * @param context
	 * @param attachment_email
	 */
	public final void setAttachment_Email(com.mendix.systemwideinterfaces.core.IContext context, emlfilegeneration.proxies.Email attachment_email)
	{
		if (attachment_email == null) {
			getMendixObject().setValue(context, MemberNames.Attachment_Email.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Attachment_Email.toString(), attachment_email.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final emlfilegeneration.proxies.Attachment that = (emlfilegeneration.proxies.Attachment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return entityName;
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
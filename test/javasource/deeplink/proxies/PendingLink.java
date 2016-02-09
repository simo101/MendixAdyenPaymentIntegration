// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package deeplink.proxies;

/**
 * 
 */
public class PendingLink
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject pendingLinkMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DeepLink.PendingLink";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		User("User"),
		Argument("Argument"),
		StringArgument("StringArgument"),
		SessionId("SessionId"),
		PendingLink_DeepLink("DeepLink.PendingLink_DeepLink");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public PendingLink(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DeepLink.PendingLink"));
	}

	protected PendingLink(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject pendingLinkMendixObject)
	{
		if (pendingLinkMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DeepLink.PendingLink", pendingLinkMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DeepLink.PendingLink");

		this.pendingLinkMendixObject = pendingLinkMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'PendingLink.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static deeplink.proxies.PendingLink initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return deeplink.proxies.PendingLink.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static deeplink.proxies.PendingLink initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new deeplink.proxies.PendingLink(context, mendixObject);
	}

	public static deeplink.proxies.PendingLink load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return deeplink.proxies.PendingLink.initialize(context, mendixObject);
	}

	public static java.util.List<deeplink.proxies.PendingLink> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<deeplink.proxies.PendingLink> result = new java.util.ArrayList<deeplink.proxies.PendingLink>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DeepLink.PendingLink" + xpathConstraint))
			result.add(deeplink.proxies.PendingLink.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of User
	 */
	public final String getUser()
	{
		return getUser(getContext());
	}

	/**
	 * @param context
	 * @return value of User
	 */
	public final String getUser(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.User.toString());
	}

	/**
	 * Set value of User
	 * @param user
	 */
	public final void setUser(String user)
	{
		setUser(getContext(), user);
	}

	/**
	 * Set value of User
	 * @param context
	 * @param user
	 */
	public final void setUser(com.mendix.systemwideinterfaces.core.IContext context, String user)
	{
		getMendixObject().setValue(context, MemberNames.User.toString(), user);
	}

	/**
	 * @return value of Argument
	 */
	public final Long getArgument()
	{
		return getArgument(getContext());
	}

	/**
	 * @param context
	 * @return value of Argument
	 */
	public final Long getArgument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Long) getMendixObject().getValue(context, MemberNames.Argument.toString());
	}

	/**
	 * Set value of Argument
	 * @param argument
	 */
	public final void setArgument(Long argument)
	{
		setArgument(getContext(), argument);
	}

	/**
	 * Set value of Argument
	 * @param context
	 * @param argument
	 */
	public final void setArgument(com.mendix.systemwideinterfaces.core.IContext context, Long argument)
	{
		getMendixObject().setValue(context, MemberNames.Argument.toString(), argument);
	}

	/**
	 * @return value of StringArgument
	 */
	public final String getStringArgument()
	{
		return getStringArgument(getContext());
	}

	/**
	 * @param context
	 * @return value of StringArgument
	 */
	public final String getStringArgument(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.StringArgument.toString());
	}

	/**
	 * Set value of StringArgument
	 * @param stringargument
	 */
	public final void setStringArgument(String stringargument)
	{
		setStringArgument(getContext(), stringargument);
	}

	/**
	 * Set value of StringArgument
	 * @param context
	 * @param stringargument
	 */
	public final void setStringArgument(com.mendix.systemwideinterfaces.core.IContext context, String stringargument)
	{
		getMendixObject().setValue(context, MemberNames.StringArgument.toString(), stringargument);
	}

	/**
	 * @return value of SessionId
	 */
	public final String getSessionId()
	{
		return getSessionId(getContext());
	}

	/**
	 * @param context
	 * @return value of SessionId
	 */
	public final String getSessionId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.SessionId.toString());
	}

	/**
	 * Set value of SessionId
	 * @param sessionid
	 */
	public final void setSessionId(String sessionid)
	{
		setSessionId(getContext(), sessionid);
	}

	/**
	 * Set value of SessionId
	 * @param context
	 * @param sessionid
	 */
	public final void setSessionId(com.mendix.systemwideinterfaces.core.IContext context, String sessionid)
	{
		getMendixObject().setValue(context, MemberNames.SessionId.toString(), sessionid);
	}

	/**
	 * @return value of PendingLink_DeepLink
	 */
	public final deeplink.proxies.DeepLink getPendingLink_DeepLink() throws com.mendix.core.CoreException
	{
		return getPendingLink_DeepLink(getContext());
	}

	/**
	 * @param context
	 * @return value of PendingLink_DeepLink
	 */
	public final deeplink.proxies.DeepLink getPendingLink_DeepLink(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		deeplink.proxies.DeepLink result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.PendingLink_DeepLink.toString());
		if (identifier != null)
			result = deeplink.proxies.DeepLink.load(context, identifier);
		return result;
	}

	/**
	 * Set value of PendingLink_DeepLink
	 * @param pendinglink_deeplink
	 */
	public final void setPendingLink_DeepLink(deeplink.proxies.DeepLink pendinglink_deeplink)
	{
		setPendingLink_DeepLink(getContext(), pendinglink_deeplink);
	}

	/**
	 * Set value of PendingLink_DeepLink
	 * @param context
	 * @param pendinglink_deeplink
	 */
	public final void setPendingLink_DeepLink(com.mendix.systemwideinterfaces.core.IContext context, deeplink.proxies.DeepLink pendinglink_deeplink)
	{
		if (pendinglink_deeplink == null)
			getMendixObject().setValue(context, MemberNames.PendingLink_DeepLink.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.PendingLink_DeepLink.toString(), pendinglink_deeplink.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return pendingLinkMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final deeplink.proxies.PendingLink that = (deeplink.proxies.PendingLink) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "DeepLink.PendingLink";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

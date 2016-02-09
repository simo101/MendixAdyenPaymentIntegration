// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package permissionsapi.proxies;

/**
 * 
 */
public class AppRole
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject appRoleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "PermissionsAPI.AppRole";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		UUID("UUID"),
		DisplayName("DisplayName");

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

	public AppRole(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "PermissionsAPI.AppRole"));
	}

	protected AppRole(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject appRoleMendixObject)
	{
		if (appRoleMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("PermissionsAPI.AppRole", appRoleMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a PermissionsAPI.AppRole");

		this.appRoleMendixObject = appRoleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AppRole.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static permissionsapi.proxies.AppRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return permissionsapi.proxies.AppRole.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static permissionsapi.proxies.AppRole initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new permissionsapi.proxies.AppRole(context, mendixObject);
	}

	public static permissionsapi.proxies.AppRole load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return permissionsapi.proxies.AppRole.initialize(context, mendixObject);
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
	 * @return value of UUID
	 */
	public final String getUUID()
	{
		return getUUID(getContext());
	}

	/**
	 * @param context
	 * @return value of UUID
	 */
	public final String getUUID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.UUID.toString());
	}

	/**
	 * Set value of UUID
	 * @param uuid
	 */
	public final void setUUID(String uuid)
	{
		setUUID(getContext(), uuid);
	}

	/**
	 * Set value of UUID
	 * @param context
	 * @param uuid
	 */
	public final void setUUID(com.mendix.systemwideinterfaces.core.IContext context, String uuid)
	{
		getMendixObject().setValue(context, MemberNames.UUID.toString(), uuid);
	}

	/**
	 * @return value of DisplayName
	 */
	public final String getDisplayName()
	{
		return getDisplayName(getContext());
	}

	/**
	 * @param context
	 * @return value of DisplayName
	 */
	public final String getDisplayName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.DisplayName.toString());
	}

	/**
	 * Set value of DisplayName
	 * @param displayname
	 */
	public final void setDisplayName(String displayname)
	{
		setDisplayName(getContext(), displayname);
	}

	/**
	 * Set value of DisplayName
	 * @param context
	 * @param displayname
	 */
	public final void setDisplayName(com.mendix.systemwideinterfaces.core.IContext context, String displayname)
	{
		getMendixObject().setValue(context, MemberNames.DisplayName.toString(), displayname);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return appRoleMendixObject;
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
			final permissionsapi.proxies.AppRole that = (permissionsapi.proxies.AppRole) obj;
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
		return "PermissionsAPI.AppRole";
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

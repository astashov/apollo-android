// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.simple_fragment.fragment

import com.apollographql.apollo.api.GraphqlFragment
import com.apollographql.apollo.api.internal.ResponseFieldMarshaller
import kotlin.String

/**
 * A humanoid creature from the Star Wars universe
 */
internal data class HumanDetailsImpl(
  override val __typename: String = "Human",
  /**
   * What this human calls themselves
   */
  override val name: String
) : HumanDetail, GraphqlFragment {
  override fun marshaller(): ResponseFieldMarshaller {
    return ResponseFieldMarshaller { writer ->
      HumanDetailsImpl_ResponseAdapter.toResponse(writer, this)
    }
  }

  companion object {
    val FRAGMENT_DEFINITION: String = """
        |fragment HumanDetails on Human {
        |  __typename
        |  name
        |}
        """.trimMargin()
  }
}
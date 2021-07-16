package org.virtuslab.internal.load.compose

import org.virtuslab.internal.YamlError
import org.virtuslab.internal.load.parse.Event

trait NodeTransform:
  def fromEvents(events: List[Event]): Either[YamlError, Node]
